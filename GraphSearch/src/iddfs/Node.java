package iddfs;

import java.util.List;
import java.util.ArrayList;

class Node {
	
	private String name; // value equivalent
	private int depthLevel = 0;
	private List<Node> adjacencyList;
	
	public Node(String name) {
		this.name = name;
		adjacencyList = new ArrayList<>();
	}
	
	public void addNeighbor(Node newNeighbor) {
		adjacencyList.add(newNeighbor);
	}
	
	public String getName() {
		return name;
	}
	
	public int getDepthLevel() {
		return depthLevel;
	}
	
	public List<Node> getAdjacencyList() {
		return adjacencyList;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDepthLevel(int depthLevel) {
		this.depthLevel = depthLevel;
	}
	
	public void setAdjacencyList(List<Node> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}
	
	@Override
	public String toString() {
		return " " + name;
	}
	
}