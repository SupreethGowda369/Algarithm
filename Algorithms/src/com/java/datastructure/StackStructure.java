package com.java.datastructure;

class StackDataStructure {
	
	int[] stack = new int[5];
	int top = -1;
	int size = 0;
	
	public int push(int ele) {
		if(top != size) {
			stack[++top] = ele;
			++size;
		}
		return ele;
	}
	
	public int pop() throws IndexOutOfBoundsException {
		if(size != 0) {
			int ele = stack[top];
			--top;
			--size;
			return ele;
		} else {
			throw new IndexOutOfBoundsException(); 
		}
	}
	
	public int size() {
		return size;	
	}
}

public class StackStructure {
	
	public static void main(String[] args) {
		
		StackDataStructure stack = new StackDataStructure();
		
		System.out.print("Pushed elements are : ");
		System.out.print(stack.push(10)+" ");
		System.out.print(stack.push(20)+" ");
		System.out.print(stack.push(30)+" ");
		System.out.print(stack.push(40)+" ");
		System.out.print(stack.push(50)+" ");
		
		System.out.println();
		
		System.out.print("Popped elements are : ");
		while(stack.size() != 0) {
			System.out.print(stack.pop()+" ");
		}
	}
}
