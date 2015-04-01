package struts2.demo.hello.action;

import struts2.demo.hello.model.MessageStore;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private static int helloCount = 0;
    
	private MessageStore messageStore;
	
	private String userName;
	
	public int getHelloCount() {
	    return helloCount;
	}
	 
	public void setHelloCount(int helloCount) {
	    HelloAction.helloCount = helloCount;
	}

	public String execute() throws Exception {
		helloCount++;
		messageStore = new MessageStore();
		return SUCCESS;
	}

	public MessageStore getMessageStore() {
		return messageStore;
	}

	public void setMessageStore(MessageStore messageStore) {
		this.messageStore = messageStore;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
