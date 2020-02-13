package com.java.datastructure;

class QueueDataStructure {

	int[] queue = new int[5];
	int size = 0;
	int front = -1;
	int end = -1;
	
	public int enqueue(int ele) {
		if(end != size) {
			if(front == -1) {
				front = 0;
			}
			queue[++end] = ele;
			++size;
		}
		return ele;	
	}
	
	public int dequeue() throws IndexOutOfBoundsException {
		if(size != 0) {
			int ele = queue[front];
			--size;
			++front;
		
			if(size == 0) {
				front = -1;
				end = -1;
			}
			return ele;
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public int size() {
		return size;
	}
}

public class QueueStructure {
	
	public static void main(String[] args) {
		
		QueueDataStructure queue = new QueueDataStructure();
		
		System.out.print("Enqueued elements are : ");
		System.out.print(queue.enqueue(10)+" ");
		System.out.print(queue.enqueue(20)+" ");
		System.out.print(queue.enqueue(30)+" ");
		System.out.print(queue.enqueue(40)+" ");
		System.out.print(queue.enqueue(50)+" ");
		
		System.out.println();
		
		System.out.print("Dequeued elements are : ");
		while(queue.size()!=0) {
			System.out.print(queue.dequeue()+" ");
		}
	}
}
