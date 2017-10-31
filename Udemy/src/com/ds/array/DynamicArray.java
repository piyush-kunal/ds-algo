package com.ds.array;

import java.util.Arrays;

public class DynamicArray<T> {
Object[] data;
int size;
	public DynamicArray() {
		size = 0;
		data = new Object[1];
	}
	public int getSize() {
		return data.length;
	}
	public T get(int index) {
		return (T) data[index];
	}
	public void put(Object element) {
		ensureCapacity(size+1);
		data[size++] = element;
	}
	public void ensureCapacity(int minCapacity) {
		int oldCapacity = getSize();
		if(minCapacity > oldCapacity) {
			int newCapacity = oldCapacity * 2;
			data = Arrays.copyOf(data, newCapacity);
		}
	}

	public static void main(String[] args) {
		DynamicArray<Integer> da = new DynamicArray<Integer>();
		da.put(2);
		System.out.println("Size "+da.getSize());
		da.put(12);
		System.out.println("Size "+da.getSize());
		da.put(22);
		System.out.println("Size "+da.getSize());
		da.put(42);
		System.out.println("Size "+da.getSize());
		da.put(27);
		System.out.println("Size "+da.getSize());
		da.put(21);
		System.out.println("Size "+da.getSize());

		for (int i = 0; i < da.getSize(); i++) {
			System.out.println(da.get(i)+" ");
		}
	}

}
