package dataStructure;

import java.util.Scanner;

public class QueueByArray {
	int front=-1,rear=-1;
	int queueArray[];
	private int size;
	QueueByArray(int size){
		this.front=-1;
		this.front=-1;
		this.size=size;
		this.queueArray=new int[size];
	}
	public void push(int data) {
		if(front==size-1)
			System.out.println("[OverFlow]");
		else if(front==-1 || rear==-1) {
			front=0;rear=0;
			queueArray[front]=data;
		}
		else {
			queueArray[++front]=data;
		}
	}
	public void pop() {
		if(front==-1)
			System.out.println("[UnderFlow]");
		else if(front==rear){
			System.out.println("deleted item [ "
		            +queueArray[front]+" ]");
			front=-1;rear=-1;
		}else {
			System.out.println("deleted item [ "
					+queueArray[rear++]+" ]");
		}
	}
	public void display() {
		System.out.print("[ ");
		if(front==-1)
			System.out.print("Empty");
		else {
		for(int i=rear;i<=front;i++)
			System.out.print(queueArray[i]+" ");
		}System.out.print("]\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueByArray queue=new QueueByArray(5);
		Scanner sc=new Scanner(System.in);
		while(true) {
			int choice;
			System.out.println("1.Push\n2.Pop\n3.Display");
			choice=sc.nextInt();
			switch(choice) {
			case 1:int data;
				System.out.println("Enter data to insert");
				data=sc.nextInt();
				queue.push(data);
				break;
			case 2: 
				queue.pop();
			    break;
			case 3:
				queue.display();
				break;
			}
			
		}
	}

}
