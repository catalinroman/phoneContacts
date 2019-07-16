package ArrayList;

public class Contacts {
	
	private long phone;
	private String name;
	
	public Contacts(String name, long phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public long getPhone() {
		return this.phone;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
