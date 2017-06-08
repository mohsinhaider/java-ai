package bfs;

import java.util.ArrayList;

public class Application {
	public static void main(String[] args) {
		Vertex vertex1 = new Vertex("#1");
		Vertex vertex2 = new Vertex("#2");
		Vertex vertex3 = new Vertex("#3");
		Vertex vertex4 = new Vertex("#4");
		Vertex vertex5 = new Vertex("#5");
		
		vertex1.addNeighors(vertex2);
		vertex1.addNeighors(vertex4);
		vertex4.addNeighors(vertex5);
		vertex2.addNeighors(vertex3);
		
		BreadthFirstSearch.BFS(vertex1);
		
	}

}
