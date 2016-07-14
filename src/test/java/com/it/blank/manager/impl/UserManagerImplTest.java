package com.it.blank.manager.impl;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.it.blank.entity.User;
import com.it.blank.manager.UserManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-public.xml",
		"classpath:spring-beans.xml","classpath:spring-MVC.xml"
})
public class UserManagerImplTest {
	
	@Resource
	private UserManager userManager ;
	
	@Test
	public void testGetUser() {
		
		System.out.println(userManager);
		System.out.println("hello");
		User user = userManager.getUser(1) ;
		System.out.println(user.getUsername());
	}

	@Test
	public void testGetAllUser() {
		List<User> users = userManager.getAllUser() ;
		
		for(User user : users) {
			System.out.println("编号："+user.getId()+" , 姓名："+user.getUsername());
		}
	}

	@Test
	public void testAddUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}

}
