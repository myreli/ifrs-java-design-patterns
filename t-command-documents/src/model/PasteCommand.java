package model;

/**
 *
 * @author Myreli
 */
public class PasteCommand implements Command {

	private final Document document;
    
    public PasteCommand (Document document){
        this.document =  document;
    }    
    
    @Override
    public void execute() {
        this.document.paste();
    }    
}
