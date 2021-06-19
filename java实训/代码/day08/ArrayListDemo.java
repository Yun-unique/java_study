package day08;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
	public ArrayListDemo() {
		// 接口的大小可变数组的实现---通过方法改变数组
		init2();
	}
	//成员方法
	private void init2() {
		ArrayList arraylist=	new ArrayList<>();
		//add(E e) 
		arraylist.add(1);
		/**
		 * private int size;
		 *  public boolean add(E e) {
        ensureCapacityInternal(size + 1);  // Increments modCount!!
        elementData[size++] = e;
        return true;
        
        
        minCapacity=10
         private void ensureCapacityInternal(int minCapacity) {
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }

        ensureExplicitCapacity(minCapacity);
         private void ensureExplicitCapacity(int minCapacity) {
        modCount++;

        // overflow-conscious code
        if (minCapacity - elementData.length > 0)
            grow(minCapacity);
            
              private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        elementData = Arrays.copyOf(elementData, newCapacity);
    }
    }

        
        
    }
        
    }
		 */
		
	}
	private void init1() {
		new ArrayList<>();
		/**
		 * public ArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
        Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    }
		 */
		new ArrayList<>(12);//创建指定长度的数组
//		 this.elementData = new Object[initialCapacity];
		

	}

	public static void main(String[] args) {
		new ArrayListDemo();
	}

}
