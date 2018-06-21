package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author myreli
 */
// abstract class
public abstract class Data {
	
	private   String PROP_SEPARATOR = ";"; 
	private	  List<String> lines;
	protected File file;
	protected List<Person> people;
	protected String output;
	protected List<String> header;
    
	Data(File file) {
		this.file = file;
	}
	
    // template method
    public final Object parseDataAndGenerateOutput(){

    	readData();
    	processData();
    	writeData();
    	export();
    	
    	return this;
    }
    
    //primitive operations
    
    //shared
    protected List<String> readData(){
    	System.out.println("Reading file... ");
		try {
			Scanner aux = new Scanner(file);
			lines = new ArrayList<>();
			while (aux.hasNextLine()) {
				lines.add(aux.nextLine());
			}
			
			System.out.println("All " + lines.size() + " lines read.\n");
			return lines;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
    }

    protected String export(){
    	if(output == null) return null;
    	System.out.println("Exporting file... ");
    	Path path = Paths.get(outputName());
        byte[] strToBytes = output.getBytes();
     
        try {
			Files.write(path, strToBytes);
			System.out.println("File " + outputName() + " exported.\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
    	return output;
    }
    
    //shared
    private Object processData() {
    	if (lines.isEmpty() || lines.size() < 1) return null;
    	
    	System.out.println("Processing data...");
    	String[] headerAttr = lines.get(0).split(PROP_SEPARATOR);
    	
    	header = new ArrayList<>();
    	for (String s : headerAttr) header.add(s);
    	    	
    	people = new ArrayList<>();
    	
    	for(String line : lines.subList(1, lines.size())) {
    		String[] attr = line.split(PROP_SEPARATOR); 
    		Person person = new Person(attr[0], attr[1], Integer.parseInt(attr[2]));
    		System.out.println("Adding person " + person);
    		people.add(person);    		
    	}
    	
    	System.out.println("All data processed.\n");    	    	
        return people;
    }

    //mutable
    protected abstract Object writeData();
    
    protected abstract String outputName();
}
