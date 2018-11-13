package com.example.demo;

import java.util.List;

public interface userDao {
	List<User> getAllUsers();
	User getUserById(String userId);
	void deleteUser(String userId);
	User createUser(String userID, String userFullName, String password, String role);
}
