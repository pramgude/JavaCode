package Dao;

import Entity.User;

public interface UserDao {
	User getUser(String Name);

	//void addUser(User u);
	
	void add(User u);
	int saveUser(User u);
	
	int updateUser(User u);
	
	int deleteUser(int UserId);
	
	
}
