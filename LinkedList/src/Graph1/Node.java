package Graph1;

import java.util.ArrayList;
import java.util.List;

public class Node {
	int data;
	List<Node> neighbour;
	State state;
    int longestPath;
    int nodeLevel;
    int color;

public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
public Node(int data)
{
	super();
	this.data=data;
	neighbour=new ArrayList<Node>();
	this.longestPath=0;
}
public State getState() {
	return state;
}
public void setState(State state) {
	this.state = state;
}
	public int getLongestPath() {
	return longestPath;
}
public void setLongestPath(int longestPath) {
	this.longestPath = longestPath;
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
public int getNodeLevel() {
	return nodeLevel;
}
public void setNodeLevel(int nodeLevel) {
	this.nodeLevel = nodeLevel;
}

	
}
