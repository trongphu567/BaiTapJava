package AlgorithmKnowledgeableForTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Node<T> implements Comparable<Node<T>> {
	private T data;
	private List<Pair<Node<T>, Integer>> parentNodes;
	private int g;
	private int h; 
	private int f; 
	private List<Pair<Node<T>, Integer>> childNodes;
	
	public Node (T data) {
		this.data = data;
		this.parentNodes = new ArrayList<>();
		this.g = 0;
		this.h = 0;
		this.childNodes = new ArrayList<>();
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}

	public List<Pair<Node<T>, Integer>> getParentNodes() {
		return parentNodes;
	}

	public void setParentNodes(List<Pair<Node<T>, Integer>> parentNodes) {
		this.parentNodes = parentNodes;
	}
	
	public void setParentNodes(Node<T> parent, int d, int h) {
		Pair<Node<T>, Integer> pair = Pair.of(parent, d);
		parent.setH(h);
		this.parentNodes.add(pair);
	}
	
	public void setParentNodes(Node<T> parent, int d) {
		Pair<Node<T>, Integer> pair = Pair.of(parent, d);
		this.parentNodes.add(pair);
	}

	public List<Pair<Node<T>, Integer>> getChildNodes() {
		return childNodes;
	}

	public void setChildNodes(List<Pair<Node<T>, Integer>> childNodes) {
		this.childNodes = childNodes;
	}
	

	public void setChildNodes(Node<T> child, int d, int h) {
		Pair<Node<T>, Integer> pair = Pair.of(child, d);
		child.setH(h);
		this.childNodes.add(pair);
	}
	

	public void setChildNodes(Node<T> child, int d) {
		Pair<Node<T>, Integer> pair = Pair.of(child, d);
		this.childNodes.add(pair);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(data);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		return Objects.equals(data, other.data);
	}

	@Override
	public int compareTo(Node<T> b) {
		if (this.f < b.getF()) {
			return -1;
		}
		else if (this.f > b.getF()) {
			return 1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		if (data instanceof String) {
			return "--> [" + this.data + ", " + this.g + ", " + this.h + ", " + this.f + "] ";
		}
		return "";
	}
}
