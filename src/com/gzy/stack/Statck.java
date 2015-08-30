package com.gzy.stack;

import java.util.Arrays;
import java.util.Stack;

@SuppressWarnings("unchecked")
public class Statck<T> {
	private Object[] elementData = new Object[3];
	private int elementCount;
	private int capacityIncrement = 3;
	
	public Stack<T> creat(){
		return null;
	}
	
	public T push(T t){
		// 判断栈是否为空
		if(elementCount+1 > elementData.length){
			// grow
			int newCapacity = elementData.length + capacityIncrement;
			elementData = Arrays.copyOf(elementData, newCapacity);
		}
		elementData[elementCount] = t;
		elementCount++;
		return t;
	}
	
	public T pop(){
		if(elementCount > 0){
			T t = (T)elementData[elementCount - 1];
			elementData[elementCount - 1] = null;
			elementCount--;
			return t;
		}
		return null;
	}
	
	public T peek(){
		if(elementData.length > 0)
			return (T)elementData[elementCount - 1];
		return null;
	}
	
	public boolean isEmpty(){
		if(elementCount > 0)
			return false;
		return true;
	}
	
	public static void main(String[] arg){
		Statck<String> test = new Statck<String>();
		test.push("aaa1");test.push("aaa2");test.push("aaa3");test.push("aaa4");test.push("aaa5");
		System.out.println(test.peek());
		System.out.println(test.pop());
		System.out.println(test.peek());
	}
}
