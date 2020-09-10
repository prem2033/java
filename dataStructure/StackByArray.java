package dataStructure;

import java.util.Scanner;

public class StackByArray {
	private int top,size;
	private int stackArray[];
	StackByArray(int size){
		this.top=-1;
		this.size=size;
		this.stackArray=new int[size];
	}
	//push the data to array
	public  void push(int data) {
		if(top==size-1)
			System.out.println("Overflow");
		else {
			stackArray[++top]=data;			
		}
	}
	//pop the data from array
	public void pop() {
		if(top==-1) System.out.println("UnderFlow");
		else {
			System.out.println("poped item is "+ stackArray[top]);
			top--;
		}
	}
	//display data of the array
	public void display() {
		System.out.print("Stack [ ");
		if(top==-1) System.out.print("Empty!!");
		else {
			for(int i=0;i<=top;i++)
				System.out.print(stackArray[i]+" ");
		}
		System.out.print("]");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackByArray stack=new StackByArray(5);
		Scanner sc=new Scanner(System.in);
		while(true) {
			int choice;
			System.out.println("1.Push\n2.Pop\n3.Display");
			choice=sc.nextInt();
			switch(choice) {
			case 1:int data;
				System.out.println("Enter data to insert");
				data=sc.nextInt();
				stack.push(data);
				break;
			case 2: 
				stack.pop();
			    break;
			case 3:
				stack.display();
				break;
			}
			
		}

	}

}
