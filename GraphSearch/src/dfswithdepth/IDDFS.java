package dfswithdepth;

import java.util.Stack;

public class IDDFS {
	
	public static void deepeningDepthFirstSearch(Node sourceNode, 
			Node targetNode, int maxDepth) {
		
		boolean isTargetFound = false;
		
		Stack<Node> stack = new Stack<>();
		stack.add(sourceNode);
		
		while (!stack.empty()) {
			Node currentNode = stack.pop();
			System.out.println(currentNode);
			
			if (currentNode.getData().equals(targetNode.getData())) {
				System.out.println("Found!");
				return;
			}
				
			for (Node neighbor : currentNode.getNeighbors()) {
				if (neighbor.getDepth() <= maxDepth) {
					stack.push(neighbor);
				}
			}
		}
		
		System.out.println("Node not found");
			
	}
}