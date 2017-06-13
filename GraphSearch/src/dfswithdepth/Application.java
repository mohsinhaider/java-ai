package dfswithdepth;

public class Application {
	public static void main(String[] args) {
		Node node1 = new Node("1", 1);
		
		Node node2 = new Node("2", 2);
		Node node5 = new Node("3", 3);
		
		Node node3 = new Node("4", 2);
		Node node6 = new Node("5", 3);
		
		Node node4 = new Node("6", 2);
		Node node7 = new Node("7", 3);
		
		node1.addNeighbor(node2);
		node1.addNeighbor(node3);
		node1.addNeighbor(node4);
		
		node2.addNeighbor(node5);
		node3.addNeighbor(node6);
		node4.addNeighbor(node7);
		
		IDDFS.deepeningDepthFirstSearch(node1, new Node("7"), 2);
	}
}
