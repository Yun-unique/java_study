package day13jihe;

import java.util.ArrayList;
import java.util.Collection;
/**
 * T:±Ì æstu
 * @author fan
 *
 * @param <Dog>
 */
public class BaseDaoDog implements BaseDao<Dog> {
	@Override
	public void add(Dog t) {
		System.out.println(t);
	}

	@Override
	public void del(Dog t) {
		System.out.println(t);
	}

	@Override
	public Dog get(int id) {
		System.out.println(id);
		return null;
	}

	@Override
	public Collection<Dog> getAll() {
		Collection<Dog> stus=new ArrayList();
		return stus;
	}
	public static void main(String[] args) {
		BaseDaoDog baseDaoStu=new BaseDaoDog();
		Dog stu=new Dog();
		baseDaoStu.add(stu);
	}

}
