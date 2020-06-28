package Graph1;

import java.util.LinkedList;
import java.util.Queue;

public class DiameterUsingLevelOrder {
/**
 * Obtain diameter using LevelOrder Code
 * @param root node
 */
	public static void DiameterUsingLO(Node root) {
		int diameter = 0;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		root.setState(State.VISITING);

		Node marker = new Node(0);
		q.add(marker);
		while (!q.isEmpty()) {
			Node current = q.remove();
			if (current == marker) {
				if (!q.isEmpty()) {
					q.add(marker);
				}
				diameter = diameter + 1;
				continue;
			}

			for (Node neighbor : current.getNeighbour()) {
				if (neighbor.getState() == State.UNVISITED) {
					q.add(neighbor);
					neighbor.setState(State.VISITING);
				}
			}
			current.setState(State.VISITED);
		}
		System.out.println(diameter);
	}

}