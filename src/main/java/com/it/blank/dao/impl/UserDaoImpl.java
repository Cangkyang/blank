package com.it.blank.dao.impl;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.it.blank.dao.UserDao;
import com.it.blank.entity.User;

public class UserDaoImpl implements UserDao {
	
	private SessionFactory sessionFactory ;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	/**
	 * 通过id查询用户
	 */
	public User getUser(Integer id) {
		String hql = "from User u where u.id=?" ;
		Query query = sessionFactory.getCurrentSession().createQuery(hql) ;
		query.setInteger(0, id);
		return (User) query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public List<User> getAllUser() {
	    String hql = "from User";  
        Query query = sessionFactory.getCurrentSession().createQuery(hql);        
        return query.list() ;
	}

	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user) ;

	}

	public boolean delUser(Integer id) {
		 String hql = "delete User u where u.id = ?";  
	     Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	     query.setLong(0, id);  
	     return (query.executeUpdate() > 0);  
	}

	public boolean updateUser(User user) {
		System.out.println("updateUser开始");
		  String hql = "update User u set u.username =?,u.age=? where u.id = ?";  
	       Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	       
	       System.out.println("getUsername=====>"+user.getUsername());
	       query.setString(0, user.getUsername());  
	      
	       query.setString(1, user.getAge());  
	       query.setLong(2, user.getId());  
	      return (query.executeUpdate() > 0); 
	}


}
