package dataStructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class BuildInQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//insertion allowed at both end
		Deque<Integer> deque = new ArrayDeque<>();  
		deque.add(1);  
		deque.add(2);  
		deque.add(3);deque.add(4);  
		//Traversing elements  
		System.out.println(deque); 
		System.out.println("Popped->["+ deque.pop()+"]");
		System.out.println(deque);

	}

}
