package com.it.blank.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.it.blank.dao.BaseDao;

@SuppressWarnings("unused")

public class BaseDaoImpl<T> implements BaseDao<T> {
	
	private Class clazz ;
	
	@Resource
	private SessionFactory sessionFactory ;
	
	
	private Session getSession(){
		return sessionFactory.getCurrentSession() ;
	}
	
	public T get(Integer id) {
		
		return null;
	}

	public List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(T t) {
		getSession().save(t) ;
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
	
	}

	public void update(T t) {
		// TODO Auto-generated method stub
		
	}

}
