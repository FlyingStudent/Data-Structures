package src;

public class Main {
    public static void main(String[] args) {
    Node root = new Node(5);
    root.setLeft(new Node(7));
    root.getLeft().setLeft(new Node(3));
    root.getLeft().setRight(new Node(15));
    root.setRight(new Node(9));
    root.getRight().setLeft(new Node(2));
    root.getRight().setRight(new Node(7));


    BinaryTree binaryTree = new BinaryTree(root);
    //traversal methods test
    System.out.print("PreOrder Traversal: ");
    binaryTree.preOrder();
    System.out.println();
    System.out.print("InOrder Traversal: ");
    binaryTree.inOrder();
    System.out.println();
    System.out.print("PostOrder Traversal: ");
    binaryTree.postOrder();
    System.out.println();
    //search 
    System.out.println("Found: " + binaryTree.searchByValue(new Node(99)));//search by value
    System.out.println("Found: "+binaryTree.search(new Node(5)));//search for an existing node

    
    


    }
}
