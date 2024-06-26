package AlgorithmKnowledgeableForTree;

import java.util.LinkedList;

public class MainRoadMap {

	public static void main(String[] args) {
		Node<String> nodeStart = new Node<String>("Arad");
		Node<String> nodeZerind = new Node<String>("Zerind");
		Node<String> nodeTimisora = new Node<String>("Timisora");
		Node<String> nodeSibiu = new Node<String>("Sibiu");
		Node<String> nodeOradea = new Node<String>("Oradea");
		Node<String> nodeLugoj = new Node<String>("Lugoj");
		Node<String> nodeMehadia = new Node<String>("Mehadia");
		Node<String> nodeDrobeta = new Node<String>("Drobeta");
		Node<String> nodeCraiova = new Node<String>("Craiova");
		Node<String> nodeRiminicuVilcea = new Node<String>("Riminicu Vilcea");
		Node<String> nodeFagaras = new Node<String>("Fagaras");
		Node<String> nodePitesti = new Node<String>("Pitesti");
		Node<String> nodeBucharest = new Node<String>("Bucharest");
		Node<String> nodeGiurgiu = new Node<String>("Giurgiu");
		Node<String> nodeUrziceni = new Node<String>("Urziceni");
		Node<String> nodeHirsova = new Node<String>("Hirsova");
		Node<String> nodeEforie = new Node<String>("Eforie");
		Node<String> nodeVaslui = new Node<String>("Vaslui");
		Node<String> nodeIasi = new Node<String>("Iasi");
		Node<String> nodeNeamt = new Node<String>("Neamt");
		
		nodeStart.setH(366);
		nodeStart.setF(nodeStart.getG() + nodeStart.getH());
		nodeStart.setParentNodes(null);
		nodeStart.setChildNodes(nodeTimisora, 118, 329); //
		nodeStart.setChildNodes(nodeSibiu, 140, 253); //
		nodeStart.setChildNodes(nodeZerind, 75, 374); //
		
		nodeTimisora.setChildNodes(nodeLugoj, 111, 244); //
		nodeTimisora.setParentNodes(nodeStart, 118); //
		
		nodeSibiu.setParentNodes(nodeOradea, 151); //
		nodeSibiu.setChildNodes(nodeFagaras, 99, 176); //
		nodeSibiu.setChildNodes(nodeRiminicuVilcea, 80, 193); //
		nodeSibiu.setParentNodes(nodeStart, 140); //
		
		nodeZerind.setChildNodes(nodeOradea, 71, 380); //
		nodeZerind.setParentNodes(nodeStart, 75); //
		
		nodeLugoj.setChildNodes(nodeMehadia, 70, 241); //
		nodeLugoj.setParentNodes(nodeTimisora, 111); //
		
		nodeOradea.setParentNodes(nodeZerind, 71); //
		nodeOradea.setChildNodes(nodeSibiu, 151, 253); //
		
		nodeFagaras.setParentNodes(nodeSibiu, 99); //
		nodeFagaras.setChildNodes(nodeBucharest, 211, 0); //
		
		nodeRiminicuVilcea.setParentNodes(nodeSibiu, 80); //
		nodeRiminicuVilcea.setChildNodes(nodePitesti, 97, 100); //
		nodeRiminicuVilcea.setParentNodes(nodeCraiova, 146); //
		
		nodeMehadia.setChildNodes(nodeDrobeta, 75, 242); //
		nodeMehadia.setParentNodes(nodeLugoj, 70); //
		
		nodeBucharest.setParentNodes(nodeFagaras, 211); //
		nodeBucharest.setParentNodes(nodePitesti, 101); //
		nodeBucharest.setChildNodes(nodeUrziceni, 85, 80); //
		nodeBucharest.setChildNodes(nodeGiurgiu, 90, 77); //
		
		nodePitesti.setParentNodes(nodeRiminicuVilcea, 97); //
		nodePitesti.setParentNodes(nodeCraiova, 138); //
		nodePitesti.setChildNodes(nodeBucharest, 101, 0); //
		
		nodeCraiova.setParentNodes(nodeDrobeta, 120); //
		nodeCraiova.setChildNodes(nodeRiminicuVilcea, 146, 193); //
		nodeCraiova.setChildNodes(nodePitesti, 138, 100); //
		
		nodeDrobeta.setParentNodes(nodeMehadia, 75); //
		nodeDrobeta.setChildNodes(nodeCraiova, 120, 160); //
		
		nodeUrziceni.setParentNodes(nodeBucharest, 85); //
		nodeUrziceni.setChildNodes(nodeHirsova, 98, 151); //
		nodeUrziceni.setChildNodes(nodeVaslui, 142, 199); //
		
		nodeGiurgiu.setParentNodes(nodeBucharest, 90); //
		
		nodeHirsova.setParentNodes(nodeUrziceni, 98); //
		nodeHirsova.setChildNodes(nodeEforie, 86, 161); //
		
		nodeVaslui.setChildNodes(nodeIasi, 92, 226); //
		nodeVaslui.setParentNodes(nodeUrziceni, 142); //
		
		nodeEforie.setParentNodes(nodeHirsova, 86); //
		
		nodeIasi.setParentNodes(nodeVaslui, 92); //
		nodeIasi.setChildNodes(nodeNeamt, 87, 234); //
		
		nodeNeamt.setParentNodes(nodeIasi, 87); //
		
		LinkedList<Node<String>> destinations = new LinkedList<Node<String>>();
		destinations.add(nodeBucharest);
		
		AKT<String> akt = new AKT<>(destinations);
		akt.search(nodeStart);
		
	}

}
