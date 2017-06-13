package iddfs;

import java.util.Stack;

public class IDDFS {
	
	// Standard DFS but track depth so we don't DFS whole graph
	private Node targetNode;
	private boolean isTargetFound; // volatile: read from main memory
	

	public void runDeepeningSearch(Node rootNode, Node targetNode) {
		int depth = 0;
		this.targetNode = targetNode;
		
		while(!isTargetFound) {
			System.out.println();
			dfs(rootNode, depth);
			depth++;
		}
	}
	
	private void dfs(Node sourceNode, int currentDepthMax) {
		Stack<Node> stack = new Stack<>();
		// depth for sourceNode is already 0
		stack.push(sourceNode);
		
		while(!stack.empty()) {
			Node currentNode = stack.pop();
			System.out.println(currentNode + " " + "depth: " + currentDepthMax);
			
			/* Before checking neighbors:
			 	* 1. Check to make sure we did not exceed depthLevel 
			 	* 2. Check if there is a match with target 
			 */
			if(currentNode.getName().equals(this.targetNode.getName())) {
				System.out.println("Found!");
				this.isTargetFound = true;
				return;
			}
			
			if(currentNode.getDepthLevel() >= currentDepthMax) {
				// Look at the next stack item, skip this one
				continue;
			}
			
			for(Node neighbor : currentNode.getAdjacencyList()) {
				neighbor.setDepthLevel(currentNode.getDepthLevel() + 1);
				stack.push(neighbor);
			}
			
		}
		
	}
	
}
