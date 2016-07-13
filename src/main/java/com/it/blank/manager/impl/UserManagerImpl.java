package com.it.blank.manager.impl;

import java.util.List;

import javax.annotation.Resource;

import com.it.blank.dao.UserDao;
import com.it.blank.entity.User;
import com.it.blank.manager.UserManager;

public class UserManagerImpl implements UserManager {

	
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public User getUser(Integer id) {
		return userDao.getUser(id);
	}

	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

	public void addUser(User user) {
		userDao.addUser(user);
	}

	public boolean delUser(Integer id) {

		return userDao.delUser(id);
	}

	public boolean updateUser(User user) {
		return userDao.updateUser(user);
	}



}
