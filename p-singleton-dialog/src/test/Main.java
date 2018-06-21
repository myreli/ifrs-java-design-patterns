package test;

import model.ErrorDialog;

public class Main {

	public static void main(String[] args) {
			
		ErrorDialog dialog = ErrorDialog.getInstance();
		
		System.out.println("testing singleton...\n\n");
		
		dialog.setHeader("Error Message");
		dialog.setMessage("default message");
		dialog.setFooter("...");

		dialog.showConsole(null);

		dialog.showConsole("simple console message...");

		dialog.showPane("simple message...");
		
		
		
		System.out.println("end of test.");
		
	}

}
