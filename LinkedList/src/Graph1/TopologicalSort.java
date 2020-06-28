package Graph1;

import java.util.Stack;

public class TopologicalSort
{
	public static Stack<Node> topoSort(Graph g)
	{
		Stack<Node> stack = new Stack<>();
		for (Node node : g.getNodes())
		{
			if (node.getState() == State.UNVISITED)
				dfsVisit(node, stack);
		}
		return stack;
	}

	public static void dfsVisit(Node node, Stack<Node> stack)
	{
		node.setState(State.VISITING);

		for (Node neighbour : node.getNeighbour())
		{
			if (neighbour.getState() == State.UNVISITED) {
				dfsVisit(neighbour, stack);
			}
		}
		node.setState(State.VISITED);
		stack.push(node);
	}
}
