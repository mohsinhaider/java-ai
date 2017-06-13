package dfswithdepth;

import java.util.List;
import java.util.ArrayList;

class Node {
	private String data;
	private int depth;
	private List<Node> neighbors;
	
	public Node(String data) {
		this.data = data;
		this.neighbors = new ArrayList<>();
	}
	
	public Node(String data, int depth) {
		this.data = data;
		this.depth = depth;
		this.neighbors = new ArrayList<>();
	}
	
	public void addNeighbor(Node neighbor) {
		this.neighbors.add(neighbor);
	}
	
	public String getData() {
		return data;
	}
	
	public List<Node> getNeighbors() {
		return neighbors;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public String toString() {
		return "" + this.data;
	}

}