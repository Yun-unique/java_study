package day14.set1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 数据的工具类Arrays 
 * 集合的工具类Collections
 * 
 * @author fan
 *
 */
public class CollectionsDemo {
   public static void main(String[] args) {
	List<Integer> ids=new ArrayList<>();
	ids.add(1);ids.add(3);ids.add(2);ids.add(4);
	System.out.println(ids);
	Collections.addAll(ids, 7,4,6,5);
	System.out.println(ids);
	Collections.sort(ids);
	System.out.println(ids);
	Collections.shuffle(ids);
	Collections.shuffle(ids);
	Collections.shuffle(ids);
	System.out.println(ids);
	
}
}
