package LinkListImpl;

public class SlowFastPointer {

	//Check if a LinkedList has a cycle
	
public static boolean HasCycle(LinkedList list)
{
	Node fast=list.head;
	Node slow=list.head;
	while(fast!=null)
	{
		fast=fast.getNext();
		if(fast==slow)
		{
			return true;
		}
		if(fast!=null)
		{
			fast=fast.getNext();
			{
				if(fast==slow)
					return true;
			}
		}
		slow=slow.getNext();
	}
	return false;
}
//Given a linked list that has a cycle, find the length of the cycle. The length is innumber of nodes.

public static int findCycleLength(LinkedList list,Node fast,Node slow)
{
	fast=fast.getNext();
	int cycleCount=1;
	while(fast!=slow)
	{
		fast=fast.getNext();
		cycleCount+=1;
	}
	return cycleCount;
}

//Find the median node of a linked list. 

public static int Median(LinkedList list)
{
	if(list.head==null ||list.tail==null)
	{
		return -1;
	}
	Node fast=list.getHead();
	Node slow=list.getHead();
	while(fast.getNext()!=null)
	{
		fast=fast.getNext();
		if(fast.getNext()!=null)
		{
			slow=slow.getNext();
			fast=fast.getNext();
		}
	}
	return slow.getData();
}
//Get the 3rd last element in a linked list

public static int FindThirdLastElement(LinkedList list)
{
	Node slow=list.getHead();
	Node third=slow.getNext().getNext();
	if(list.head==null)
	{
		return -1;
	}
	while(third.next!=null)
	{
		third=third.next;
		slow=slow.next;
	}
	return slow.data;
}
}
