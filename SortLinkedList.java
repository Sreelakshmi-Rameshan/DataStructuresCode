package LinkListImpl;

//You are given a Linked List with nodes that have values 0,1 or 2.Sort the linked list
public class SortLinkedList {

	public static LinkedList sortList(LinkedList list) 
	{
		if(list.head==null)
		{
			return list;
		}
		Node current=list.head;
		LinkedList list0 = new LinkedList(null,null);  
		LinkedList list1 = new LinkedList(null,null);    
		LinkedList list2 = new LinkedList(null,null);
		while(current!=null)
		{
			switch(current.getData())
			{
			case 0:list0.append(current);
			break;
			case 1:list1.append(current);
			break;
			case 2:list2.append(current);
			}     
		current = current.getNext();
			}
		// set tails to null
		if (list0.tail != null) 
			list0.tail.next = null; 
		if (list1.tail != null)  
			list1.tail.next = null; 
		if (list2.tail != null)  
				list2.tail.next = null;
		// attach lists in sequence   
		LinkedList result = new LinkedList(null,null); 
		appendList(list0, result);   
		appendList(list1, result); 
		appendList(list2, result); 
		
		return result;
	}
	public static void appendList(LinkedList toAppend, LinkedList original) 
	{   
		if (toAppend == null || toAppend.head == null)       
			return;  
		original.append(toAppend.head);  
		original.tail = toAppend.tail;
		}
}
