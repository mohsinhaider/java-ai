package recursivedfs;

import java.util.List;
import java.util.ArrayList;

class Vertex {
	private boolean marked;
	private List<Vertex> neighbors;
	private int data;
	
	public Vertex(int data) {
		this.data = data;
		neighbors = new ArrayList<>(); // avoiding NullPointerException
		this.marked = false;
	}
	
	public void setMarked(boolean marked) {
		this.marked = marked;
	}
	
	public boolean getMarked() {
		return marked;
	}
	
	public void setNeighbors(List<Vertex> neighbors) {
		this.neighbors = neighbors;
	}
	
	public List<Vertex> getNeighbors() {
		return neighbors;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void addNeighbor(Vertex neighbor) {
		neighbors.add(neighbor);
	}
	
	@Override
	public String toString() {
		return "" + this.data;
	}
	
}