package collectionJAVA;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
class sortreverse implements  Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}	
}
class sortreversebyname implements Comparator<String>{
	@Override
	public int compare(String s1,String s2) {
		return (int)(s2.compareTo(s1));
	}
}

public class Custom_sort_MAP_TREESET {

	public static void main(String[] args) {
//sort using the Annonymous class
		TreeMap<Integer,String> treemap=new TreeMap<Integer,String>((Comparator<? super Integer>) new Comparator<Integer>() {
			public int compare(Integer o1,Integer o2) {
				return (int)(o2-o1);
			}
		});
		 treemap.put(1,"apple");  treemap.put(8,"boat");
		 treemap.put(10, "banana");  treemap.put(20, "neat");
		 //System.out.println(treemap);	
//convert to Map.Entry
		 for(Map.Entry m:treemap.entrySet())
			 System.out.println(m.getKey()+" "+m.getValue());
//sort reverse using the Comparator Interface		 
		 TreeMap<Integer,String> treemap1=new TreeMap<>(new sortreverse());
		 treemap1.put(1,"Apple");  treemap1.put(8,"boat");
		 treemap1.put(10, "Cat");  treemap1.put(20, "dog");
		 System.out.println(treemap1);
//sort the name using the comparaotr interface		 
		 TreeMap<String,Integer> treemap2=new TreeMap<>(new sortreversebyname());
		 treemap2.put("Apple",1);  treemap2.put("boat",8);
		 treemap2.put( "Cat",10);  treemap2.put("dog",20);
		 System.out.println(treemap2);
		 
		 

	}

}
