package p2;

public class Friend {
	private String name;
	private String mobile;
	private String email;

	public Friend(String name, String mobile, String email) {
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return name + "\t" + mobile + "\t" + email;
	}

	public void setAll(String str, String str1, String str2) {
		this.name = str;
		this.mobile = str1;
		this.email = str2;
	}

}
