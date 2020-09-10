package collectionJAVA;

//Java program to demonstrate working of Comparator 
//interface 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

//A class to represent a student. 
class Studentx
{ 
	int rollno; 
	String name, address; 

	// Constructor 
	public Studentx(int rollno, String name, 
							String address) 
	{ 
		this.rollno = rollno; 
		this.name = name; 
		this.address = address; 
	} 

	// Used to print student details in main() 
	public String toString() 
	{ 
		return this.rollno + " " + this.name + 
						" " + this.address; 
	} 
} 

class Sortbyroll1 implements Comparator<Studentx> 
{ 
	// Used for sorting in ascending order of 
	// roll number 
	public int compare(Studentx a, Studentx b) 
	{ 
		return a.rollno - b.rollno; 
	} 
} 

class Sortbyname2 implements Comparator<Studentx> 
{ 
	// Used for sorting in ascending order of 
	// roll name 
	@Override
	public int compare(Studentx o1, Studentx o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	} 
} 

//Driver class 
public class Use_of_ANNYMOUS_and_COMPARATOR_INTERFACE_for_sort 
{ 
	public static void main (String[] args) 
	{ 
		ArrayList<Studentx> ar = new ArrayList<Studentx>(); 
		ar.add(new Studentx(111, "bbbb", "london")); 
		ar.add(new Studentx(131, "aaaa", "nyc")); 
		ar.add(new Studentx(121, "cccc", "jaipur")); 

		System.out.println("Unsorted"); 
		for (int i=0; i<ar.size(); i++) 
			System.out.println(ar.get(i)); 
//sort using the Comaprator Interface 
		Collections.sort(ar, new Sortbyroll1()); 

		System.out.println("\nSorted by rollno"); 
		for (int i=0; i<ar.size(); i++) 
			System.out.println(ar.get(i)); 
//Sort using the Annynomyus Class
		Collections.sort(ar, new Comparator<Studentx>() {
			@Override
			public int compare(Studentx o1, Studentx o2) {
				return o1.rollno-o2.rollno;
			}			
		}); 

		System.out.println("\nSorted by name"); 
		for (int i=0; i<ar.size(); i++) 
			System.out.println(ar.get(i)); 
		System.out.println(ar);
	} 
} 


