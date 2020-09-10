package collectionJAVA;
import java.util.*;
class Student{
	String name;int roll;double marks;
	Student(String name,int roll,double marks){
		this.name=name;this.roll=roll;this.marks=marks;
	}
}
//implementing the Comparator interface to Custom sorting
class MyComparatormarks implements Comparator{

	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;Student s2=(Student)o2;
		/*if(s1.marks<s2.marks)	    return -1;
		else if(s1.marks>s2.marks)	return 1;
		else	return 0; //to remove the duplication*/
		return (int) (s1.marks-s2.marks);
	  }
	
}
//sort  by name
class MyComparatorname implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		String s1=o1.name;
		String s2=o2.name;
		if(s1.compareTo(s2)<0) {
			return -1;
		}else
			return 1;
	}
	
}
//DRIVER CLASS
/*LINKEDHASHSET and HASHSET can't be sort
 * TreeSet insertion in natural order so we can usse
 * comparator to custom sorting*/
public class Custom_Sorting_SET_using_INTERFACE_Comparator {
	public static void main(String[] args) {
		// custom sorting in the TreeSet class if more than one elements
//pass Comparator function to perform custom sort(its compulasory)
//beacuse TreeSet stores the data in any logical order
//default natural order
		TreeSet<Student> tree=new TreeSet(new MyComparatormarks());
		TreeSet<Student> tree1=new TreeSet(new MyComparatorname());
		HashSet<Student> tree2=new HashSet<Student>();//sorting can not be done
	   //sortingcan not be done
		LinkedHashSet<Student> tree3=new LinkedHashSet<Student>();
		Student s1=new Student("prem",12,60);
		Student s2=new Student("tushar",14,70);
		Student s3=new Student("abishek",34,50);
		Student s4=new Student("prashant",01,40);
		Student s5=new Student("prem",12,60);
		
		tree.add(s1);tree.add(s2);tree.add(s3);tree.add(s4);tree.add(s5);
		tree1.add(s1);tree1.add(s2);tree1.add(s3);tree1.add(s4);tree.add(s5);
		tree2.add(s1);tree2.add(s2);tree2.add(s3);tree2.add(s4);tree2.add(s5);
		tree3.add(s1);tree3.add(s2);tree3.add(s3);tree3.add(s4);tree3.add(s5);
		System.out.println("SORTED  BY MARKS.................");
		for(Student x:tree)
			System.out.println(x.marks+" "+x.name+" "+x.roll);
		System.out.println("SORETD BY NAME...................");		
		for(Student x:tree1)
			System.out.println(x.name+" "+x.marks+" "+x.roll);
		System.out.println("Hash SET WITHOUT SORTING(Sorting not possible)");
		for(Student x:tree2)
			System.out.println(x.name+" "+x.marks+" "+x.roll);
		System.out.println("LINKED HASH SET(Sorting cannot be done)");
		for(Student x:tree3)
			System.out.println(x.name+" "+x.marks+" "+x.roll);
		/*Collections.sort(tree3,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return (int)(o1.marks-o2.marks);
			}		
		});*/
		LinkedHashSet<Integer> linkhashset=new LinkedHashSet<>();
		linkhashset.add(8);linkhashset.add(5);linkhashset.add(3);
		linkhashset.add(1);linkhashset.add(10);linkhashset.add(6);
		/*Collections.sort(linkhashset);*/
		System.out.println(linkhashset);
		
	}

}
