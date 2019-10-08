import java.util.*;
class CircularQueue
{
int front=-1;
int rear=-1;
int maxsize=4;
int queue[]=new int[4];

void insert( Scanner sc)
{
	System.out.println("enter the data to be inserted...");
	int value=sc.nextInt();
	if((rear==maxsize-1 && front==0)|| front==rear+1)
	{
		System.out.println("overflow!!!");
	}
	else if(front==-1 && rear==-1)
	{
		rear=0;
		front=0;
	}
	else if(rear==maxsize-1 && front!=0)
	{
		rear=0;
	}
	else
	{
		rear++;
	}
	queue[rear]=value;
	System.out.println("data inserted!!!");
}

void delete()
{
	if(front ==-1 && rear==-1)
	{
		System.out.println("underflow!!!");
	}	
	else if(front==rear)
	{
		front=-1;
		rear=-1;
	}
	else if(front==maxsize-1)
	{
		front=0;
	}
	else
	{
		front++;
	}
	System.out.println("deleted!!!");
}

void display()
{
	System.out.println(front+" .... "+rear);
	if(front==-1)
	{
		System.out.println("queue is empty");
	}
	else if(rear>front)
	{
		System.out.println("Your data is ......");
		for(int i=front;i<=rear;i++)
		{
		System.out.println(queue[i]);
		}
	}
	else
	{
		System.out.println("Your data is ......");
		for(int i=front;i<=maxsize-1;i++)
		{
		System.out.println(queue[i]);
		}
		for(int i=0;i<=rear;i++)
		{
		System.out.println(queue[i]);
		}
	}
}

public static void main(String s[])
{
	CircularQueue c=new CircularQueue();
	Scanner sc=new Scanner(System.in);
	int choice;
	do
	{
		System.out.println("1 insert value into circular Queue");
		System.out.println("2 delete value from circular Queue");
		System.out.println("3 display data from circular Queue");
		System.out.println("4 exit");
		
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1: c.insert(sc);
			break;
			
			case 2:c.delete();
			break;
			
			case 3: c.display();
			break;
			
			case 4:
			System.out.println("Thank You So mauch......");
			System.exit(0);
			break;
			
			default: System.out.println("you entered a wrong choice");
		};
	}
	while(choice!=4);
}
}