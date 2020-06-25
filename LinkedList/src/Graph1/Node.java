package Graph1;

import java.util.ArrayList;
import java.util.List;

public class Node {
	int data;
	List<Node> neighbour;
	State state;
public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
public Node(int data)
{
	super();
	this.data=data;
	neighbour=new ArrayList<Node>();
}
	public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public List<Node> getNeighbour() {
	return neighbour;
}
public void setNeighbour(List<Node> neighbour) {
	this.neighbour = neighbour;
}
	
}
