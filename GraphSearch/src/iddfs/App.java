package iddfs;

public class App {
	public static void main(String[] args) {
		
		Node a = new Node("A");
		Node b = new Node("B");
		Node c = new Node("C");
		Node d = new Node("D");
		Node e = new Node("E");
		
		//       A
		//    B     C
		//  D   E
		a.addNeighbor(b);
		a.addNeighbor(c);
		b.addNeighbor(d);
		d.addNeighbor(e);
		
		IDDFS iddfs = new IDDFS();
		iddfs.runDeepeningSearch(a, e);
		
	}
}
