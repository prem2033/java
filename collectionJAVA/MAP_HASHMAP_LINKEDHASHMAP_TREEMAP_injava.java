package collectionJAVA;import java.util.*;

public class MAP_HASHMAP_LINKEDHASHMAP_TREEMAP_injava {

	public static void main(String[] args) {
/*Insertion order not preserved
 * sorting can not be done
 * for iterate through loop need to convert into Map.Entry()
 * Duplication not allowed
 * 1.containsKey()
 * 2.containsValue()
 * 3.replace(key,new_value)
 * 4.put(key,value)
 * 5.get(key)
 * 6.remove(key)*/
		HashMap<Integer,String> hashmap=new HashMap<>();
		hashmap.put(1,"apple");hashmap.put(8,"boat");
		hashmap.put(10, "banana");hashmap.put(20, "neat");
		hashmap.put(20, "neat");
		System.out.println(hashmap);
/*LinkedHAsMAp insertion Preserved 
 * use doubly linklist to store the data*/		
		LinkedHashMap<Integer,String> linkedhashmap =new LinkedHashMap<Integer,String>();
		 linkedhashmap.put(1,"apple"); linkedhashmap.put(8,"boat");
		 linkedhashmap.put(10, "banana"); linkedhashmap.put(20, "neat");		 
		System.out.println( linkedhashmap);
/*TreeMap in java
 * it store on logical order on key*/
		TreeMap<Integer,String> treemap=new TreeMap<>();
		 treemap.put(1,"apple");  treemap.put(8,"boat");
		 treemap.put(10, "banana");  treemap.put(20, "neat");
		 System.out.println(treemap);
//iterate using Map.Entry
		 for(Map.Entry m:treemap.entrySet())
			 System.out.println(m.getKey()+" "+m.getValue());	
//return keyset of the MAP
		 for(Integer name:hashmap.keySet()) {
			 System.out.print(name+" ");
		 }System.out.println();
//return the values of the MAP
	     for(String xam:hashmap.values()) {
	    	 System.out.print(xam+" ");
	     }System.out.println();
//method of treemap to get first and last key of the map entry
	     System.out.println("first key-->>"+treemap.firstKey());
	     System.out.println("last key-->>"+treemap.lastKey());
	     System.out.println("first value-->>"+treemap.firstEntry());
	     System.out.println("extract value-->>"+treemap.get(10));
	}

}
