package recursivedfs;

public class DepthFirstSearch {
	public static void DFS(Vertex start) {
		start.setMarked(true);
		System.out.println(start);
		
		for (Vertex neighbor : start.getNeighbors()) {
			if (neighbor.getMarked() == false) {
				DFS(neighbor);
			}
		}
	}
}
