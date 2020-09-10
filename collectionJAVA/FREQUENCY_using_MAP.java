package collectionJAVA;
import java.util.*;
public class FREQUENCY_using_MAP {
	public static void main(String []args) {
		String s="hello this is hello wordl";
		char arr[]=s.toCharArray();//charAt(index);
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(Character c:arr) {
			if(hm.containsKey(c))
				hm.replace(c, hm.get(c)+1);
			else 
				hm.put(c, 1);
		}
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			}
		   ArrayList<Integer> list=new ArrayList<Integer>();int i=1;
		   while(i<=10)
			   list.add(i++);
		 // Set<Character> st = new HashSet<Character>(); 
		  //Collections.reverse(list);//get reverse String
		  // System.out.println(list);
		   System.out.println(Collections.binarySearch(list,8));
		  System.out.println(list);
	        //for (Character b : list) 
	            //System.out.println(b + ": " + Collections.frequency(list,b)); 
	        System.out.println(Collections.frequency(list, 'h'));
	}

}
