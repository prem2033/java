package collectionJAVA;import java.util.*;

public class SET_HASHSET_LINKEDLISTSET_TREESET_injava {

	public static void main(String[] args) {
/*sorting can not be perform on HashSet 
 inserton not Preserved*/
		System.out.println("HashSet");
		HashSet<Integer> hashset=new HashSet<>();
		hashset.add(10);hashset.add(6);hashset.add(5);
		hashset.add(9);hashset.add(8);hashset.add(100);
		System.out.println(hashset);
		Iterator it=hashset.iterator();
		while(it.hasNext()) System.out.print(it.next()+" ");
		System.out.println();
		
/*LinkedHasSet can not allow sorting
 *but it insertion order is preserved */
		System.out.println("LinkedList");
		LinkedHashSet<Integer> linkhashset=new LinkedHashSet<Integer>();
		linkhashset.add(10);linkhashset.add(6);linkhashset.add(5);
		linkhashset.add(9);linkhashset.add(8);linkhashset.add(100);
		System.out.println(linkhashset);Collections.max(linkhashset);
/*TreeSet insertion order not preserved 
 * but it follow an logical order we can perform custom sorting using
 * Comparator Interface and Annymous class*/
		System.out.println("TreeSet");
	     TreeSet<Integer> treeset=new TreeSet<Integer>();
		 treeset.add(10); treeset.add(6); treeset.add(5);
		 treeset.add(9);treeset.add(8); treeset.add(100);
		 System.out.println("natural sorting");
		 System.out.println(treeset);
/*custom sorting on thr treeset*/		 
		 TreeSet<Integer> treeset1=new TreeSet<Integer>(new Comparator<Integer>(){
				@Override
				public int compare(Integer o1, Integer o2) {
					return o2-o1;
				}
				
			});
		 treeset1.add(10); treeset1.add(6); treeset1.add(5);
		 treeset1.add(9);treeset1.add(8); treeset1.add(100);
		 System.out.println("custom sorting");
		 System.out.println(treeset1);treeset1.remove(5);
		 System.out.println(treeset1);
		 int l1=treeset1.pollLast();int l2=treeset1.pollLast();
		 System.out.println(l1-l2);
		 
/*TreeSet method
 * 1.first() * 2.last()
 * 3.pollFirst() * 4.pollLast() //no get method
 * 5.remove(key) * 6.contains()
 * 7.clear() * 8.size()*/
	}

}
