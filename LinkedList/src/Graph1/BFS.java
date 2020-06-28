package Graph1;

import java.util.LinkedList;
import java.util.Queue;

public class BFS 
{

	public static boolean Bfs(Graph graph, int target)
	{
		for (Node node : graph.getNodes())
		{
			if (node.getState() == State.UNVISITED && bfsVisit(node, target))
			{
				return true;
			}
		}
		return false;
	}

	private static boolean bfsVisit(Node node, int target)
	{

		Queue<Node> q = new LinkedList<>();
		q.add(node);
		node.setState(State.VISITING);
		while (!q.isEmpty())
		{
			Node current = q.remove();
			if (current.getData() == target)
				return true;
			for (Node neighbour : current.getNeighbour())
			{
				if (neighbour.getState() == State.UNVISITED)
				{
					q.add(neighbour);
					neighbour.setState(State.UNVISITED);
				}
			}
			current.setState(State.VISITED);
		}
		return false;
	}
}
