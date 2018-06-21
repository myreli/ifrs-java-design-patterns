package model;

import java.io.File;

/**
 *
 * @author myreli
 */
// concrete class
public class DataSql extends Data {
	
	private String OUTPUT_NAME = "outputPlainText.txt";
	
	/**
	 * @param file
	 */
	public DataSql(File file) {
		super(file);
	}

	// primitive mutable operation
    @Override
    protected String writeData() {
    	output = "CREATE TABLE " + Person.class.getSimpleName() + "("
    			+ header.get(0);
    	for (Person p : people) {
    		output += p.getLegalDocument() + " " + getSqlFieldType(p.getLegalDocument().getClass().getSimpleName())
    		+ ", " + p.getName() + " " + getSqlFieldType(p.getName().getClass().getSimpleName())
    		+ ", " + p.getAge() + " " + getSqlFieldType(p.getName().getClass().getSimpleName());
    	}
    	
        return output;
    }

	/* (non-Javadoc)
	 * @see model.Data#outputName()
	 */
	@Override
	protected String outputName() {
		return OUTPUT_NAME;
	}
	
	private String getSqlFieldType(String field) {
		switch(field) {
			case "boolean": return "BIT"; 
			case "Integer": return "INTEGER";
			default: return "VARCHAR";
					
		}
		
	}
    
}
