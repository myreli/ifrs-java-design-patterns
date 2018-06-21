package model;

/**
 *
 * @author Myreli
 */
public class MenuItem {
    
    Command command;   
    
    public void setComamnd(Command command){
        this.command = command;
    }
        
    public void perform(){
        this.command.execute();
    }
    
}
