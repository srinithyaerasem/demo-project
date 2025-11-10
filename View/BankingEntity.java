package View;

public class BankingEntity {
	private String Email;
	private String Username;
	private String password;

	public BankingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public BankingEntity(String email, String username, String password) {
		super();
		Email = email;
		Username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "BankingEntity [Email=" + Email + ", Username=" + Username + ", password=" + password + "]";
	}



}
