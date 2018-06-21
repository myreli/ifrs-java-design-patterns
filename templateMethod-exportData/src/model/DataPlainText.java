package model;

import java.io.File;

/**
 *
 * @author myreli
 */
// concrete class
public class DataPlainText extends Data {
	
	private String OUTPUT_NAME = "outputPlainText.txt";
	
	/**
	 * @param file
	 */
	public DataPlainText(File file) {
		super(file);
	}

	// primitive mutable operation
    @Override
    protected String writeData() {
    	output = "";
    	for (Person p : people) output += p.toString() + "\n";
    	
        return output;
    }

	/* (non-Javadoc)
	 * @see model.Data#outputName()
	 */
	@Override
	protected String outputName() {
		return OUTPUT_NAME;
	}
    
}
