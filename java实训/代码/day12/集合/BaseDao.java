package day13jihe;

import java.util.Collection;

/**
 * 1.类的泛型 T: 某一种预知类型
 * 
 * @author fan
 *
 */
public interface BaseDao<T> {
	void add(T t);

	void del(T t);

	T get(int id);

	Collection<T> getAll();

}
