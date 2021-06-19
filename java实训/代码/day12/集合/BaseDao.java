package day13jihe;

import java.util.Collection;

/**
 * 1.��ķ��� T: ĳһ��Ԥ֪����
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
