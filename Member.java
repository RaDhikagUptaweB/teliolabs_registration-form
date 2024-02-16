
public class Member {
	private String uname, password, email, phone;

	
	public Member() {
		super();
	}

	public Member(String name, String password, String email, String phone) {
		super();
		this.uname = name;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
