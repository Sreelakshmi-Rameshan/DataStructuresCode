package Graph1;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class GraphTest {
	public static void main(String args[])
	{
		Node ONE=new Node(1);
		Node TWO=new Node(2);
		Node THREE=new Node(3);
		Node FOUR=new Node(4);
		Node FIVE=new Node(5);
		Node SIX=new Node(6);
		Node SEVEN=new Node(7);
		Node EIGHT=new Node(8);
		Node NINE=new Node(9);

		ONE.setState(State.UNVISITED);
		TWO.setState(State.UNVISITED);
		THREE.setState(State.UNVISITED);
		FOUR.setState(State.UNVISITED);
		FIVE.setState(State.UNVISITED);
		SIX.setState(State.UNVISITED);
		SEVEN.setState(State.UNVISITED);
		EIGHT.setState(State.UNVISITED);
		NINE.setState(State.UNVISITED);

		List<Node> nodes =new LinkedList<Node>();
		nodes.add(ONE);
		nodes.add(TWO);
		nodes.add(THREE);
		nodes.add(FOUR);
		nodes.add(FIVE);
		nodes.add(SIX);
		nodes.add(SEVEN);
		nodes.add(EIGHT);
		nodes.add(NINE);
		
		List<Node> onesNeighbor =new LinkedList<Node>();
		List<Node> twoNeighbor =new LinkedList<Node>();
		List<Node> fourNeighbor =new LinkedList<Node>();
		List<Node> fiveNeighbor =new LinkedList<Node>();
		List<Node> sixNeighbor =new LinkedList<Node>();
		List<Node> eightNeighbor =new LinkedList<Node>();
		
		onesNeighbor.add(TWO);
		onesNeighbor.add(FOUR);
		twoNeighbor.add(THREE);
		twoNeighbor.add(SIX);
		fourNeighbor.add(FIVE);
		fiveNeighbor.add(NINE);
		sixNeighbor.add(SEVEN);
		sixNeighbor.add(EIGHT);
		eightNeighbor.add(NINE);

		
		ONE.setNeighbour(onesNeighbor);
		TWO.setNeighbour(twoNeighbor);
		FOUR.setNeighbour(fourNeighbor);
		FIVE.setNeighbour(fiveNeighbor);
		SIX.setNeighbour(sixNeighbor);
		EIGHT.setNeighbour(eightNeighbor);
		
		Graph graph=new Graph(nodes);
		
		System.out.println(DFS.dfs(graph,3));
		System.out.println(BFS.Bfs(graph,3));
		LevelOrder.levelOrder(ONE);
		
		//Graph Diameter
		System.out.println(GraphDiameter.Diameter(ONE));
		
		//Topological sort
		Stack<Node> toposort=new Stack<Node>();
		toposort=TopologicalSort.topoSort(graph);
		while(!toposort.isEmpty())
		{
			System.out.println(toposort.pop().getData());
		}
		
		//Clone graph
		System.out.println(CloneGraph.clone(ONE).getData());
	}
}
