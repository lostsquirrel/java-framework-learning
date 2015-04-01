package struts2.demo.hello.action;

import struts2.demo.hello.exception.LogicException;
import struts2.demo.hello.model.Person;

import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Person personBean;

	@Override
    public String execute() throws Exception {
//		int x = 1 / 0;
		if (personBean.getAge() == 22)
			throw new LogicException("Are you kidding me?");
        //call Service class to store personBean's state in database
        return SUCCESS;
         
    }
	
	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person personBean) {
		this.personBean = personBean;
	}
	
	public void validate(){
	    if (personBean.getFirstName().length() == 0 ){ 
	        addFieldError( "personBean.firstName", "First name is required." );
	    }
	     
	    if (personBean.getEmail().length() == 0 ){ 
	        addFieldError( "personBean.email", "Email is required." );
	    }
	     
	    if (personBean.getAge() < 18 ){ 
	        addFieldError( "personBean.age", "Age is required and must be 18 or older" );
	    }
	     
	}
}
