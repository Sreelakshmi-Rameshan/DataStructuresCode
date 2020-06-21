package LinkListImpl;

public class ReverseLinkedList {

	public static Node Reverse(LinkedList list)
	{
		Node prev=null;
		Node curr=list.head;
		while(curr.next!=null)
		{
			Node next=curr.getNext();
			curr.setNext(prev);
			prev=curr;
			curr=next;
		}
		return prev;
	}
	public static void printList(Node node)
	{
		while(node!=null)
		{
			System.out.println(node.data +" ");
			node=node.next;
		}
	}
}
