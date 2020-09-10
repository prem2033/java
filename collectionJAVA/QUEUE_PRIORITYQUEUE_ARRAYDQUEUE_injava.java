package collectionJAVA;
import java.util.*;
public class QUEUE_PRIORITYQUEUE_ARRAYDQUEUE_injava {
	public static void main(String[] args) {
/*PriorityQueue store the data on the ASCII values
 * 1.contains()      //check for contain
 *2. peek()     	//only seek head element without remove
 *3. poll()         //retrive and remove
 * 4.remove()		//remove head element
 * 5.isEmpty() 		//check for empty
 * 6.clear() 		//clear the list
 * 7.size()			//return size of the queue
 * 8.toArray()      //return array
 * */
/*removal happen on the ASCII values,insertion order not preserved*/
		PriorityQueue<Integer> pqueue=new PriorityQueue<>();
		pqueue.add(10);pqueue.add(9);pqueue.add(6);//pqueue.add(4);
		pqueue.add(1);pqueue.add(2);pqueue.add(4);pqueue.add(5);
		System.out.println(pqueue);
		pqueue.remove(); //removes from the head of PriorityQueue
		System.out.println(pqueue);//System.out.println(Collections.max(pqueue));
		//pqueue.remove(Collections.max(pqueue));
		//System.out.println(pqueue);
		pqueue.poll();pqueue.poll();
		System.out.println(pqueue);
		
/*insertiopn order preserved and removal happen from the 
		head  of the queue*/
		System.out.println("==================================");
	       Queue<Integer> que=new LinkedList<>();
	       que.add(1);que.add(3);que.add(4);que.add(5);
	       que.add(9);que.add(8);que.add(7);que.add(6);
	       System.out.println(que);
	       System.out.println(que.remove());//remvoe from head
	       System.out.println(que);
	       System.out.println(que.poll());;
	       System.out.println(que);
/*poll() removes from the head(front) of queue if empty return null
 * add() add elements to the head tail of the queue
 * remove() same as poll but throw NoSuchElementException
 * peek() retrive the head of the Queue*/
		}
	}

