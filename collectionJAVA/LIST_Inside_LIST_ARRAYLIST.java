package collectionJAVA;
import java.util.*;

public class LIST_Inside_LIST_ARRAYLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* list to be different to insert into the multi arraylist*/
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(1);a1.add(2);a1.add(3);
		list.add(a1);
		System.out.println(list);
		System.out.println("====================1");
		//a1.clear();
		ArrayList<Integer> a2=new ArrayList<>();
		a2.add(9);a2.add(8);a2.add(7);
		list.add(a2);
		//System.out.println(list);
		for(ArrayList<Integer> x:list) 
			System.out.println(x);
		System.out.println("=====================2");
		//System.out.println(list);
		//2d ArrayList in java
		ArrayList<ArrayList<Integer>> list1=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<4;i++) {
			ArrayList<Integer> aux=new ArrayList<>();
			for(int j=0;j<4;j++) {
				
				aux.add(j+i);
			}
			list1.add(aux);
		}
		for(ArrayList<Integer> x:list)
			System.out.println(x);
		System.out.println("======================3");
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.get(i).size();j++) {//get the size of inner list
				System.out.print(list.get(i).get(j)+" ");
			}
			System.out.println();
		}
		System.out.println("======================4");
		System.out.println("index 0 ele->>"+list.get(0));
		list.get(0).add(0,5);//adding element to index 00
		System.out.println("after add to 0 index\n"+list.get(0));
		list.get(1).add(4); //adding element to indxe 1
		System.out.println(list);

	}

}
