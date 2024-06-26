package AlgorithmKnowledgeableForTree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class AKT<T> {
	public Set<Node<T>> visitedNode;
	public Set<Node<T>> destinations; 
	
	public AKT () {
		visitedNode = new HashSet<>();
		this.destinations = new HashSet<>();
	}
	public AKT (LinkedList<Node<T>> destinations) {
		this();
		this.destinations.addAll(destinations);
	}
	

	public void search(Node<T> initialNode) {
		var queue = new PriorityQueue<Node<T>>();
		queue.add(initialNode);
		visitedNode.add(initialNode);
		while (!queue.isEmpty()) {
			var currentNode = queue.poll();
			if (destinations.contains(currentNode)) {
				printSolutionPath(initialNode, currentNode);
				return;
			}
			visitedNode.add(currentNode);
			var pairs = currentNode.getChildNodes();
			if (currentNode.getParentNodes() != null)
				pairs.addAll(currentNode.getParentNodes());
			for (var pair : pairs) {
				if (!visitedNode.contains(pair.first)) {
					pair.first.setG(currentNode.getG() + pair.second);
					pair.first.setF(pair.first.getG() + pair.first.getH());
					queue.add(pair.first);
				}
			}
		}
		System.out.println("Not Solution Found.");
	}
	

	public void printSolutionPath(Node<T> initialNode, Node<T> sollution) {
		var g = sollution.getG();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Solution path\n");
		Stack<Node<T>> path = new Stack<>();
		while (sollution.getParentNodes() != null) {
			path.push(sollution);
			List<Pair<Node<T>, Integer>> pairs = sollution.getParentNodes();
			for (Pair<Node<T>, Integer> pair: pairs) {
				int temp = pair.first.getG() + pair.second;
				if (temp == sollution.getG()) {
					sollution = pair.first;
				}
			}
		}
		path.push(initialNode);
		while (!path.isEmpty()) {
			Node<T> node = path.pop();
			stringBuilder.append(node.toString());
		}
		System.out.print(stringBuilder.toString());
		System.out.println("\nG = " + g);
	}
}
