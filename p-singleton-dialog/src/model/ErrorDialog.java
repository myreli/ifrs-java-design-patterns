package model;

import javax.swing.JOptionPane;

public class ErrorDialog {
	
	private static ErrorDialog uniqueInstance;
	
	private String header;
	private String footer;
	private String message;
	
	private ErrorDialog() {}
	
	public static synchronized ErrorDialog getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new ErrorDialog();
		
		return uniqueInstance;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String showConsole(String m) {
		System.out.println(getHeader() + "\n--" + (m == null? getMessage() : m) + "--\n" + getFooter());
		return getHeader() + "\n--" + (m == null? getMessage() : m) + "--\n" + getFooter();
	}
	
	public void showPane(String m) {
		JOptionPane.showMessageDialog(null, m, getHeader(), JOptionPane.ERROR_MESSAGE);
	}
}
