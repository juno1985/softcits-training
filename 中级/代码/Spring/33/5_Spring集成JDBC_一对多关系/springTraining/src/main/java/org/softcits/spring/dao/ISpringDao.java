package org.softcits.spring.dao;
//定义一个DAO的接口,所有的子实现类都需要具有增删改查的功能
public interface ISpringDao<T> {
	public void insert(T u);
	public void delete(int id);
	public void modify(T u);
	public T load(int id);

}
