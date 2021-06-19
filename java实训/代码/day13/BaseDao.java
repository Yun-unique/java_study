package day14;
/**
 * 预知的数据类型
 * @author fan
 *1.在接口中使用泛型
 * @param <T>
 */
public interface BaseDao<T> {
	void add(T t);

}
