package Graph1;

import java.util.HashMap;

public class CloneGraph
{
	public static Node clone(Node root) 
	{
		if (root == null)
			return null;
		HashMap<Node, Node> map = new HashMap<>();
		Node rootCopy = new Node(root.getData());
		map.put(root, rootCopy);
		dfs(map, root);

		return rootCopy;
	}

	private static void dfs(HashMap<Node, Node> map, Node root)
	{
		root.setState(State.VISITING);

		for (Node neighbour : root.getNeighbour())
		{
			if (!map.containsKey(neighbour))
			{
				map.put(neighbour, new Node(neighbour.getData()));
			}
			Node rootCopy = map.get(root);
			Node neighbourCopy = map.get(neighbour);
			rootCopy.getNeighbour().add(neighbourCopy);
			if (neighbour.getState() == State.UNVISITED)
				dfs(map, neighbour);
		}
		root.setState(State.VISITED);
	}
}
