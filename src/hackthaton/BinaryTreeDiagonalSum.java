package hackthaton;

import java.util.LinkedList;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.TreeMap;

class Node {
    int nodeValue;
    int diagonalDistance = Integer.MAX_VALUE;
    Node leftNode,rightNode;
    
    public Node(int nodeValue) {
        this.nodeValue = nodeValue;
    }    
    //class can be improved using getters and setters, due to time constraints skipping now
}
class BinaryTree {
    Node rootNode;
    public BinaryTree(Node rootNode) {
        this.rootNode = rootNode;
    }
    
    public void getDiagonalSum() {
        //storing node values
        Queue<Node> queue = new LinkedList<Node>();
        Map<Integer,Integer> map = new TreeMap<>();
        rootNode.diagonalDistance=0;
        queue.add(rootNode);
        
        while (!queue.isEmpty()) {
            Node current = queue.remove();
            int dd = current.diagonalDistance;
            while (Optional.ofNullable(current).isPresent())  {
                int sum = Optional.ofNullable(map.get(dd)).orElse(0);
                map.put(dd,sum+current.nodeValue);
                if (Optional.ofNullable(current.leftNode).isPresent()) {
                    current.leftNode.diagonalDistance = dd+1;
                    queue.add(current.leftNode);
                }
                current = current.rightNode;
            }
        }        
        
        System.out.println("Diagonal Sum of given Binary Tree is ");
        map.entrySet().forEach(entrySet -> {
        	 System.out.print(entrySet.getValue()+",");
        });
    }
    
}
public class BinaryTreeDiagonalSum {
    public static void main(String args[]) {
        //Node and Tree classes needs to created first
        Node rootNode = new Node(1);
        rootNode.leftNode = new Node(2);
        rootNode.rightNode = new Node(3); 
        rootNode.leftNode.leftNode = new Node(4);
        rootNode.rightNode.leftNode = new Node(6);
        rootNode.leftNode.rightNode = new Node(5);
        rootNode.rightNode.rightNode = new Node(7); 
        //Tree formation completed
        //Next BinaryTree class to calculate the diagonal sum
        BinaryTree binaryTree = new BinaryTree(rootNode);
        binaryTree.getDiagonalSum();
    }
}