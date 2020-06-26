package Graph1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Print Graph in Level Order: Given a graph and a node N, print the Graph in
 * order of distance from N. Each level should be in a new line
 * 
 * @author Sree Implemented using marker
 */
public class LevelOrder
{
	public void levelOrder(Node root)
	{
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		root.setState(State.VISITING);

		Node marker = new Node(0);
		q.add(marker);
		while (!q.isEmpty())
		{
			Node current = q.remove();
			if (current == marker)
			{
				if (!q.isEmpty())
				{
					q.add(marker);
				}
				System.out.println();
				continue;
			}
			System.out.println(current);

			for (Node neighbor : current.getNeighbour())
			{
				if (neighbor.getState() == State.UNVISITED)
				{
					q.add(neighbor);
					neighbor.setState(State.VISITING);
				}
			}
			current.setState(State.VISITED);
		}
	}

}
