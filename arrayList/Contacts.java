package arrayList;

public class Contacts {
	
	private String phone;
	private String name;
	
	public Contacts(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
