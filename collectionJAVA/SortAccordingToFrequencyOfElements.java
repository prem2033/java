package collectionJAVA;
	//Initial Template for Java
	import java.util.*;
	import java.io.*;
	import java.lang.*;
	import java.util.Map.Entry;
	class SortAccordingToFrequencyOfElements 
	{
		public static void main(String[] args) throws NumberFormatException, IOException
		{
			BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(sc.readLine());
		    while(n != 0)
			{
				int size = Integer.parseInt(sc.readLine());
				int arr[] = new int[size];
				String[] temp = sc.readLine().trim().split(" ");
				
				for(int i = 0; i < size; i++)
				    arr[i] = Integer.parseInt(temp[i]);
				for(int i = 0; i < size; i++)
				    System.out.print(arr[i]);
				System.out.println();
				    
				    new Sorting().sortByFreq(arr, size);
				    System.out.println();
				n--;
			}
		}
	}
	/*This is a function problem.You only need to complete the function given below*/
	//User function Template for Java
	class Sorting
	{
	    static void sortByFreq(int arr[], int n)
	    {
	      //inserting (keys value in HashMap)
	        HashMap<Integer,Integer> list=new HashMap<Integer,Integer>();
	        ArrayList<Integer> list2=new ArrayList<Integer>();
	        for(Integer x:arr){
	            if(list.containsKey(x)){
	                list.replace(x,list.get(x)+1);
	            }else{
	               list.put(x,1);
	            }
	        }
	      
		    // Create a list from elements of HashMap 
	               List<Map.Entry<Integer, Integer> > linklist = 
	               new LinkedList<Map.Entry<Integer, Integer> >(list.entrySet()); 
	  
	        // Sort the list  according to values
	        Collections.sort(linklist, new Comparator<Map.Entry<Integer, Integer> >() { 
	            public int compare(Map.Entry<Integer, Integer> o1,  
	                               Map.Entry<Integer, Integer> o2) 
	            { 
	                return (o1.getValue())-(o2.getValue()); 
	            } 
	        }); 
	        //sort 
	       /* Collections.sort(linklist, new Comparator<Map.Entry<Integer, Integer> >() { 
	            public int compare(Map.Entry<Integer, Integer> o1,  
	                               Map.Entry<Integer, Integer> o2) 
	            { 
	                return (o1.getKey())-(o2.getKey()); 
	            } 
	        });*/
	          
	        // put data from sorted list to hashmap  
	        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
	        for (Map.Entry<Integer, Integer> aa : linklist) { 
	            temp.put(aa.getKey(), aa.getValue()); 
	        } 
	        for(Map.Entry b:temp.entrySet()) {
	        	for(int i=0;i<(int)b.getValue();i++)
	        		  System.out.print(b.getKey()+" ");
	        }
	        
	    }
	}
