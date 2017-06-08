package dfs;

import dfs.DepthFirstSearch;
import dfs.Vertex;

import java.util.List;
import java.util.ArrayList;

public class Application {
	public static void main(String[] args) {
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		Vertex v7 = new Vertex(7);
		
		v1.addNeighbor(v2);
		v2.addNeighbor(v3);
		v1.addNeighbor(v4);
		v4.addNeighbor(v5);
		v1.addNeighbor(v6);
		v6.addNeighbor(v7);
		
		List<Vertex> vertexList = new ArrayList<>();
		vertexList.add(v1);
		
		
		DepthFirstSearch.DFS(vertexList);
	}

}
