package LinkListImpl;

public class DeleteNode {
 
public static void deleteWithoutPrev(Node n,LinkedList list)
{
	Node next=n.getNext();
	n.setData(next.getData());
	delete(next,n,list);
}
public static void delete(Node n,Node prev,LinkedList list)
{
	if(n==null)
	{
		return;
	}
	if(n==list.head)
	{
		list.head=n.next;
	}
	if(n==list.tail)
	{
		list.tail=prev;
	}
	 if (prev != null)    
		 prev.setNext(n.getNext());    
}
}
