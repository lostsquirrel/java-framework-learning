package demo.cxf.hello.server;

public class UserImpl implements User{

	private String name;

	public UserImpl() {}
	
	public UserImpl(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	
}
