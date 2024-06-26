package dao;

import java.util.ArrayList;

public interface daoInterface<T> {
	public int insert(T t);
	public int update(String id, T t);
	public int delete(T t);
	public ArrayList<T> importDTB();
	public T selectByID(T t);
	public ArrayList<T> selectByCondition(String cd);
}
