package Graph1;

import java.util.Stack;

/**
 * Diameter of a Graph: Given a directed graph, find the length of the longest
 * path in the graph.
 * 
 * @author Sree
 *
 */
public class GraphDiameter
{
	public static int Diameter(Node node)
	{
		if (node == null)
			return 0;
		Stack<Node> topoSort = topoSort(node);
		int diameter = 0;
		while (!topoSort.isEmpty())
		{
			Node current = topoSort.pop();
			diameter = Math.max(diameter, current.getLongestPath());

			for (Node neighbor : current.getNeighbour())
			{
				if (current.getLongestPath() + 1 > neighbor.getLongestPath())
					neighbor.setLongestPath(current.getLongestPath() + 1);
			}
		}
		return diameter;
	}

	public static Stack<Node> topoSort(Node node)
	{
		Stack<Node> stack = new Stack<>();
		if (node.getState() == State.UNVISITED)
			TopologicalSort.dfsVisit(node, stack);
		return stack;
	}
}
