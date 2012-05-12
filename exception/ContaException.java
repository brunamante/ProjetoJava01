package br.com.softex.exception;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class ContaException extends Exception {

	private List<String> messages = new ArrayList<String>();

	public ContaException() {
		super();
	}
	
	public ContaException(String message) {
		super(message);
	}
	
	public void addMessage(String msg) {
		messages.add(msg);
	}
	
	public List<String> getMessages() {
		return messages;
	}
 }
