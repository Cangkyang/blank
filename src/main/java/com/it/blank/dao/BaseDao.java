package com.it.blank.dao;

import java.util.List;

public interface BaseDao<T> {
	//通过id查询
	public T get(Integer id);
	
	//查询所有
	public List<T> getAll();
	
	//添加
	public void add(T t);
	
	//删除
	public void delete(Integer id);
	
	//更新
	public void update(T t);
}
