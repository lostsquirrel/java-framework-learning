package struts2.demo.hello.model;

public class MessageStore {

	private String message;

	public MessageStore() {

		setMessage("Hello Struts User From Model");
	}

	public String getMessage() {

		return message;
	}

	public void setMessage(String message) {

		this.message = message;
	}
}
