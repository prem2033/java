package collectionJAVA;
import java.util.*;
/*1.Collection.sort()
 * 2.Collections.reverse()
 * 3.Collections.max()
 * 4.Collections.min()
 * 5.Collections.binarySearch(list, 10)*/
/*Arraylist methods
 * 1.add() * 2.remove(index) * 3.get(index)
 * 4.clear() * 5.contains()
 * 6.set(index,replace) //replace index element with replace
 * 7.sort() 8.size()*/
class std{
	int x;String s;
	std(int x,String s){
		this.x=x;this.s=s;
	}
}
public class LIST_ARRAYLIST_and_LINKEDLIST_injava {
	public static void main(String[] args) {
//Arraylist in java,Insertion preserved
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);list.add(45);list.add(67);	list.add(25);
		list.add(12);list.add(40);list.add(0);
		System.out.println(list.remove(0));
		System.out.println(list.indexOf(0));
		System.out.println(list);
//LinkedList in java of set interface Insertion order preserved
		LinkedList<Integer> linklist=new LinkedList<Integer>();
		linklist.add(10);linklist.add(45);linklist.add(67);	linklist.add(25);
		linklist.add(12);linklist.add(40);linklist.add(95);
		System.out.println("befoe sort the");
		System.out.println(linklist);
//sort using the comparator
		Collections.sort(linklist,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {return o2-o1;}	});
		System.out.println("after custom sort the LinkedList");
		System.out.println(linklist);
//stack implemention in java		
		Stack<Integer> stack=new Stack<Integer>();
		stack.add(12);stack.add(11);stack.add(15);stack.add(10);
		stack.add(23);stack.add(92);stack.add(12);stack.add(02);
		System.out.println("Stack");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println("after pop");
		System.out.println(stack);
		System.out.println("after push");
		stack.push(99);
		System.out.println(stack);
		System.out.println("after sort");
		Collections.sort(stack);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(Collections.min(stack));
		ArrayList<std> classlist=new ArrayList<std>();
		classlist.add(new std(1,"apple"));classlist.add(new std(2,"cat"));
		classlist.add(new std(3,"dog"));classlist.add(new std(4,"zebra"));
		Collections.sort(classlist,new Comparator<std>() {
			@Override
			public int compare(std o1, std o2) { return o2.x-o1.x; }		
		});
		System.out.println("reverse order");
		for(std f:classlist)
			System.out.print(f.x+"="+f.s+" ");
	}

}
/*converting an array to the LinkedList
 * LinkedList<Integer> list=new LinkedList<>(Arrays.asList(array))*/
 