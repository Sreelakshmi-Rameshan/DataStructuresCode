package Graph1;

public class DFS {
public static boolean dfs(Graph graph,int target)
{
	for(Node node : graph.getNodes())
	{
		if(node.getState()==State.UNVISITED && dfsVisit(node,target))
		{
			return true;
		}
	}
	return false;
}

private static boolean dfsVisit(Node node, int target) {
	node.setState(State.VISITING);
	if(node.getData()==target)
	{
		return true;
	}
	for(Node neighbour:node.getNeighbour())
	{
		if(node.getState()==State.UNVISITED && dfsVisit(neighbour,target)) {
			return true;
		}
	}
	node.setState(State.VISITED);
	return false;
}
}
