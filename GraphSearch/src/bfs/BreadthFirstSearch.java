package bfs;

import java.util.Queue;
import java.util.LinkedList;

public class BreadthFirstSearch {
	
	public static void BFS(Vertex start) {
		Queue<Vertex> nodesToVisit = new LinkedList<>();
		start.setVisited(true);
		nodesToVisit.add(start);
		System.out.println("Visiting " + start);
		
		while(!nodesToVisit.isEmpty()) {
			// current is now a reference to the Vertex inside of the queue
			Vertex current = nodesToVisit.remove();
			
			for (Vertex neighbor : current.getNeighbors()) {
				if (!neighbor.getVisited()) {
					System.out.println("Visiting " + neighbor);
					neighbor.setVisited(true);
					nodesToVisit.add(neighbor);
				}
			}
		}
		
	}
}
