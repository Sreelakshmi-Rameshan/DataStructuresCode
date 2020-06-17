package LinkListImpl;

public class LinkedList{
	Node head;
	Node tail;
	public LinkedList(Node tail,Node head)
	{
		super();
		this.tail=tail;
		this.head=head;
	}
	public void setHead(Node head) {
		this.head=head;
	}
	public Node getHead()
	{
		return head;
	}
	public void setTail(Node tail) {
		this.tail=tail;
	}
	public Node getTail()
	{
		return tail;
	}
}