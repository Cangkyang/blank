package com.it.blank.manager;

import java.util.List;

import com.it.blank.entity.User;

public interface UserManager {

	public User getUser(Integer id);
	
	public List<User> getAllUser();
	
	public void addUser(User user);
	
	public boolean delUser(Integer id);
	
	public boolean updateUser(User user);
}