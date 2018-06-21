import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import model.Data;
import model.DataPdf;
import model.DataPlainText;

/**
 *
 * @author myreli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	    	
    	// Scanner file = new Scanner(System.in);
    	File file = new File("/home/myreli/eclipse/jee-oxygen/eclipse/templateMethod-exportData/input.csv");
		
		Data plainText = new DataPlainText(file);
		
		plainText.parseDataAndGenerateOutput();

		Data pdf = new DataPdf(file);
		
		pdf.parseDataAndGenerateOutput();
    }
    
}
