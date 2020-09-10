package dataStructure;
import java.net.StandardSocketOptions;
import java.util.*;
class dataType{
	int age;String name;
	dataType(int age,String name){
		this.age=age;
		this.name=name;
	}
}
public class BuildInStack {
	public static void main(String[] args) {
		// Bulid in Stack in java
        Stack<Integer> stack=new Stack();
        stack.push(1);stack.push(2);stack.push(3);
        stack.push(4);stack.push(5);
        System.out.println(stack);
        System.out.println("popped ->> " +stack.pop());
        Iterator<Integer> itr=stack.iterator();
        while(itr.hasNext()){  
        	System.out.print(itr.next()+" ");  
        	}System.out.println();
        	
 
        //Custom stack in java by using a class as datatype
System.out.println("===========================================");
        System.out.println("Custom Stack");
        dataType datatype1=new dataType(23,"prem");
        dataType datatype2=new dataType(24,"Rock");
        dataType datatype3=new dataType(25,"Prakash");
        dataType datatype4=new dataType(22,"Priya");
        Stack<dataType> customStack=new Stack<>();
        customStack.push(datatype1);customStack.push(datatype2);
        customStack.push(datatype3);customStack.push(datatype4);
        System.out.print("Stack [ ");
        for (dataType data : customStack)
			System.out.print("{ "+data.name + "," + data.age+"}");
        System.out.println(" ]");
        dataType popobject;
        popobject=customStack.pop();
        System.out.println("Popped->["+popobject.age+","+
        popobject.name+"]");
        System.out.print("Stack [ ");
        for (dataType data : customStack)
			System.out.print("{ "+data.name + "," + data.age+"}");
        System.out.println(" ]");
	}
        
}