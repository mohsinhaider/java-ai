package bfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private boolean visited;
	private List<Vertex> neighbors;
	private String data;
	
	public Vertex(String data) {
		this.data = data;
		this.neighbors = new ArrayList();
	}
	
	public boolean getVisited() {
		return visited;
	}
	
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	public List<Vertex> getNeighbors() {
		return neighbors;
	}
	
	public void setNeighbors(List<Vertex> neighbors) {
		this.neighbors = neighbors;
	}
	
	public void addNeighors(Vertex neighbor) {
		this.neighbors.add(neighbor);
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return this.data;
	}
}