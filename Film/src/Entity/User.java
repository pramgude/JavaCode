package Entity;

public class User {
	int userId;
	String Name;
	String Email;
	String Theatre;
	
	
	public User(int userId,String Name,String Email,String Theatre) {
		this.userId=userId;
		this.Name=Name;
		this.Email=Email;
		this.Theatre=Theatre;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTheatre() {
		return Theatre;
	}

	public void setTheatre(String theatre) {
		Theatre = theatre;
	}

	public void setEmail(String email) {
		Email = email;
	}

	

}
