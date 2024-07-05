package org.core.model;

public interface Model<T> {
	
	int create(T t);
	
	T findById(int id);
	
	int update(T t);
	
	int delete(T t);

}
