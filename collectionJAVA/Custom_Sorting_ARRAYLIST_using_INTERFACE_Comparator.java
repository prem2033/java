package collectionJAVA;

import java.util.*;

class Student1 {
	int rollno;	String name, address;
	public Student1(int rollno, String name, String address) {
		this.rollno = rollno;this.name = name;
		this.address = address;
	}
}
//use to sort by the Student Rollnumber
class SortbyRoll implements Comparator<Student1> {
	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.rollno - o2.rollno;
	}
}
//use to sort by the name
class SortByName implements Comparator<Student1> {
	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.name.compareTo(o2.name);
	}
}

public class Custom_Sorting_ARRAYLIST_using_INTERFACE_Comparator {
	public static void main(String[] args) {
// same as LinkedList/ArrayList/Stack/Vector
		LinkedList<Student1> ar = new LinkedList<Student1>();
		// roll name address
		ar.add(new Student1(1, "prem", "london"));
		ar.add(new Student1(5, "barma", "nyc"));
		ar.add(new Student1(2, "aman", "jaipur"));
		ar.add(new Student1(2, "aman", "jaipur"));
		System.out.println("Unsorted linkedlist of student object");
		for (Student1 s : ar)
			System.out.println(s.name + " " + s.rollno + " " + s.address);
//sorting using the simple class
		Collections.sort(ar, new SortbyRoll());
		System.out.println("\nSorted by rollno using Comparator Interface");
		for (Student1 s : ar)
			System.out.println(s.rollno + " " + s.name + " " + s.address);
//sorting using the annynomus class
		Collections.sort(ar, new Comparator <Student1>() {
			@Override
			public int compare(Student1 o1, Student1 o2) {
				return o1.name.compareTo(o2.name);
			}
			
		});
		System.out.println("\nSorted by name usnig Annoymous class");
		for (Student1 s : ar)
			System.out.println(s.name + " " + s.rollno + " " + s.address);
	}

}
