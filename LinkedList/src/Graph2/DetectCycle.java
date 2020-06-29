package Graph2;

import Graph1.Graph;
import Graph1.Node;
import Graph1.State;

public class DetectCycle {
	public static boolean HasCycle(Graph graph)
	{
		for(Node node : graph.getNodes())
		{
			if(node.getState()==State.UNVISITED && hasCycleDfsVisit(node))
			{
				return true;
			}
		}
		return false;
	}

	private static boolean hasCycleDfsVisit(Node node) {
		node.setState(State.VISITING);
		for(Node neighbour:node.getNeighbour())
		{
			if(node.getState()==State.UNVISITED && hasCycleDfsVisit(neighbour)) {
				return true;
			}
			else if(node.getState()==State.VISITING)
			{
				return true;
			}
		}
		node.setState(State.VISITED);
		return false;
	}
	}

