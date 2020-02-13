package com.java.datastructure;

class Node {	
	Node next;
	int data;

	public Node(int data) {
		this.data = data;
	}
}

class CircularLinkedList { 	
	Node head = null;
	Node tail = null;
	int size = 0;
	
	public boolean add(int data) {
		Node node = new Node(data);
        size++;
		if(head == null) {
			head = node;
			tail = node;
            return true;
		}
		tail.next = node;
		tail = node;
		return true;
    }
	
	public boolean add(int data, int pos) {
		Node node=new Node(data);
        size++;
		if(pos == 0) {
			node.next = head;
			head = node;
			return true;
		}
		else if(pos == size-1) {
			tail.next = node;
			tail = node;
			return true;
		}
        else {
        	int i=0;
    		Node temp = head;
    		while(i < pos-1) {
        		temp = temp.next;
        		i++;
    		}
    		node.next = temp.next;
    		temp.next = node;
      		return true;
    	}
  	}
	
	public boolean replace(int data, int pos) {
		if(pos==0) {
			head.data = data;
			return true;
		}
		else if(pos == size-1) {
			tail.data = data;
			return true;
		}
		else {
			Node temp = head;
			int i=0;
			while(i < pos) {
				temp = temp.next;
				i++;
			}
			temp.data = data;
			return true;
		}
    }	
	
	public boolean remove(int pos) {
    	if(pos == 0) {
    	    Node temp = head.next;
    		head.next = null;
    		head = temp;
    		size--;
    		return true;
    	}
    	else {
    	   int i=0;
    	   Node temp1 = head;
           Node temp2;
    	   while(i < pos-1) {
             temp1 = temp1.next;
             i++;
    	   }
           temp2 = temp1.next;
    	   temp1.next = temp2.next;
    	   temp2.next = null;
    	   size--;
    	   return true;
    	}
    }
	
	public int get(int pos) throws IndexOutOfBoundsException {
    	if(pos < 0) {
    		throw new IndexOutOfBoundsException();
    	}
    	if(pos == 0) {
    		return head.data;
    	}
    	if(pos == size-1) {
    		return tail.data;
    	}
    	Node temp = head;     
    	int i=0;
    	while(i < pos) {
    		temp = temp.next;
    		i++;
    	}
        return temp.data;
    }
	
	public String toString() {
		String res = "";
		Node temp = head;

		while(temp != null) {
			res = res + " " + temp.data;
			temp = temp.next;
		}
		return res;
	}

	public int size() {
		return size;
	}
}

public class CircularList {
	
	public static void main(String[] args) {
		
		CircularLinkedList circular = new CircularLinkedList();
		
		System.out.println("----------------------------------------------------");
		System.out.println("Size : " + circular.size());
		System.out.println("=====================*ADD ELEMENT*==================");
	    circular.add(10);
	    circular.add(20);
		circular.add(30);
		circular.add(40);
		circular.add(50);
		circular.add(60);
		circular.add(70);
		circular.add(80);
		System.out.print("Elements in List : ");
	    System.out.println(circular);
	    System.out.print("Index of Element :  ");
	    for(int i=0;i<circular.size();i++) {
			System.out.print(i+"  ");
		}

	    System.out.println("\nSize : " + circular.size());

		circular.add(55,0);
	    circular.add(44,4);
	    circular.add(33,3);
	    System.out.println("\n================*ADD AT SPECIFIC INDEX*=============");
	    System.out.print("Elements in List : ");
	    System.out.println(circular);
	    System.out.print("Index of Element :  ");
	    
	    for(int i=0;i<circular.size();i++) {
			System.out.print(i+"  ");
		}

	    System.out.println("\nSize : " + circular.size());

	    circular.replace(54,0);
	    circular.replace(43,4);
	    circular.replace(32,3);
	    System.out.println("\n=============*REPLACE AT SPECIFIC INDEX*============");
	    System.out.print("Elements in List : ");
	    System.out.println(circular);
	    System.out.print("Index of Element :  ");
	    
	    for(int i=0;i<circular.size();i++) {
			System.out.print(i+"  ");
		}
	    
	    System.out.println("\nSize : " + circular.size());

		circular.remove(0);
		circular.remove(3);
	    circular.remove(0);
	    System.out.println("\n============*REMOVE FROM SPECIFIC INDEX*============");
	    System.out.print("Elements in List : ");
	    System.out.println(circular);
	    System.out.print("Index of Element :  ");
	    
	    for(int i=0;i<circular.size();i++) {
			System.out.print(i+"  ");
		}

	    System.out.println("\nSize : " + circular.size());
	    System.out.println("----------------------------------------------------");

	    /* 
	    System.out.println(circular.get(-8));   //IndexOutOfBoundsException
	    System.out.println(circular.get(20));   //NullPointerException
	    */
	}
}
