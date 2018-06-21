package test;

import model.CopyCommand;
import model.Document;
import model.MenuItem;
import model.PasteCommand;

/**
 *
 * @author Myreli
 */
public class Main {

	public static void main(String[] args) {
		
		System.out.println("testing command design pattern\n\n");
		
        Document document 		= new Document();
        MenuItem menuItem 		= new MenuItem();
        
        CopyCommand copyCommand 	= new CopyCommand(document);
        PasteCommand pasteCommand 	= new PasteCommand(document);

        menuItem.setComamnd(pasteCommand);
        menuItem.perform();
        menuItem.setComamnd(copyCommand);
        menuItem.perform();
        
        System.out.println("\n\nend of test.");
    }
    
}
