package model;

import java.io.File;

/**
 *
 * @author myreli
 */
// concrete class
public class DataPdf extends Data {
	
	private String OUTPUT_NAME = "outputPdf.pdf";
	
	/**
	 * @param file
	 */
	public DataPdf(File file) {
		super(file);
	}

	// primitive mutable operation
    @Override
    protected String writeData() {
    	if(people == null || people.isEmpty()) return null;
    	output = "";
    	for (Person p : people) output += p.toString() + "\n";
    	
        return output;
    }

	@Override
	protected String outputName() {
		return OUTPUT_NAME;
	}
	
	@Override
	protected String export(){
    	return "implementar";
    }
    
}
