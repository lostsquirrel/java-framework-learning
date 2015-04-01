package struts2.demo.hello.action;

import struts2.demo.hello.model.Person;

import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Person personBean;

	@Override
    public String execute() throws Exception {
         
        //call Service class to store personBean's state in database
         
        return SUCCESS;
         
    }
	
	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person personBean) {
		this.personBean = personBean;
	}
	
}
