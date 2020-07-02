/*package Graph2;

import Graph1.Graph;
import Graph1.Node;
import Graph1.State;

import java.util.*;
import javafx.util.*;

public class BipartiteGraph {
	public static Pair<List<Node>> Bipartite(Graph graph) {
		for (Node node : graph.getNodes()) {
			node.setState(State.UNVISITED);
			node.setNodeLevel(-1);
		}

		List<Node> group1 = new ArrayList<Node>();
		List<Node> group2 = new ArrayList<Node>();

		for (Node node : graph.getNodes()) {
			if (node.getState() == State.UNVISITED) {
				Pair<List<Node>> groups = getBipartiteGroups(node);
				if (groups == null)
					return null;
				group1.addAll(groups.getFirst());
				group2.addAll(groups.getSecond());
			}
		}
		return new Pair<List<Node>>(group1, group2);
	}

	private static Pair<List<Node>> getBipartiteGroups(Node start) {
		Queue<Node> q = new LinkedList<Node>();
		List<Node> oddNodes = new ArrayList<Node>();
		List<Node> evenNodes = new ArrayList<Node>();
		q.add(start);
		start.setNodeLevel(0);
		start.setState(State.VISITING);
		while (!q.isEmpty()) {
			Node current = q.remove();
			
			if (current.getNodeLevel() % 2 == 0)
				evenNodes.add(current);
			else
				oddNodes.add(current);
			for (Node neighbor : current.getNeighbour()) {
				if (neighbor.getState() == State.UNVISITED) {
					neighbor.setNodeLevel(current.getNodeLevel() + 1);
					q.add(neighbor);
					neighbor.setState(State.VISITING);
				} else if (neighbor.getNodeLevel() == current.getNodeLevel()) {

					return null;
				}
			}
			current.setState(State.VISITED);
		}
		return new Pair<List<Node>> (oddNodes, evenNodes);
	}

}
*/