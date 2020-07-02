package Graph2;

import Graph1.Graph;
import Graph1.Node;
import Graph1.State;

public class ColorConnectedComponents {
	public static void colorConnectedComponents(Graph graph) {
		int color = 0;
		for (Node node : graph.getNodes()) {
			if (node.getState() == State.UNVISITED) {
				dfsVisit(node, color++);
			}
		}
	}

	public static void dfsVisit(Node node, int color) {
		node.setState(State.VISITING);
		node.setColor(color);
		for (Node neighbor : node.getNeighbour()) {
			if (neighbor.getState() == State.UNVISITED) {
				dfsVisit(neighbor, color);
			}
		}
		node.setState(State.VISITED);
	}
}
