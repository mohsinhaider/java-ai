package dfs;

import dfs.Vertex;
import java.util.Stack;

import java.util.List;

public class DepthFirstSearch {
	
	private static Stack<Vertex> s = new Stack<>();

	
	public static void DFS(List<Vertex> vertexList) {
		for (Vertex v : vertexList) {
			if (!v.getMarked()) {
				v.setMarked(true);
				dfsWithStack(v);
			}
		}
	}
	
	private static void dfsWithStack(Vertex v) {
		v.setMarked(true);
		s.add(v);
		
		while(!s.isEmpty()) {
			Vertex current = s.pop();
			System.out.println(current);
			
			for (Vertex neighbor : current.getNeighbors()) {
				if (!neighbor.getMarked()) {
					neighbor.setMarked(true);
					s.push(neighbor);
				}
			}
			
		}
	}
}
