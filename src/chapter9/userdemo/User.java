package chapter9.userdemo;
/**
 * 1.
 * 2.
 * 3.
 * @author sunguangyu
 *
 */
public class User {
	private String userName;
	private String password;
	private String email;
	
	
	public User() {
		super();
	}
	public User(String userName, String password, String email){
		setUserName(userName);
		setPassword(password);
		setEmail(email);
	
	
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
