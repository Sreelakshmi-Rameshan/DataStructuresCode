package LinkListImpl;

public class Node{
	int data;
	public Node next;
	public Node(int data,Node next)
	{
		super();
		this.next=next;
		this.data=data;
	}
	public void setNext(Node next) {
		this.next=next;
	}
	public Node getNext()
	{
		return next;
	}
	public void setData(int data) {
		this.data=data;
	}
	public int getData()
	{
		return data;
	}
	
}

