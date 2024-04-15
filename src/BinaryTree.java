package src;

public class BinaryTree {
    // attributes
    private Node root;

    BinaryTree() {
    }

    BinaryTree(Node root) {
        this.root = root;
    }

    // traverse
    public void preOrder() {
        preOrderHelper(this.root);
    }

    public void preOrderHelper(Node root) {
        // base case
        if (root != null) {
            System.out.print(root.getData() + " ");
            preOrderHelper(root.getLeft());
            preOrderHelper(root.getRight());
        }
    }

    public void inOrder() {
        inOrderHelper(this.root);
    }

    public void inOrderHelper(Node root) {
        // base case
        if (root != null) {
            inOrderHelper(root.getLeft());
            System.out.print(root.getData() + " ");
            inOrderHelper(root.getRight());
        }
    }

    public void postOrder() {
        postOrderHelper(this.root);
    }

    public void postOrderHelper(Node root) {
        // base case
        if (root != null) {
            postOrderHelper(root.getLeft());
            postOrderHelper(root.getRight());
            System.out.print(root.getData() + " ");
        }
    }

    // search
    public boolean searchHelper(Node root, Node node) {
        if (root == null)
            return false;
        if (root == node)
            return true;

        return searchHelper(root.getLeft(), node) || searchHelper(root.getRight(), node);
    }

    public boolean search(Node node) {
        return searchHelper(this.root, node);

    }
    public boolean searchByValueHelper(Node root, Node node)
    {
        if(root ==null)
        return false;
        if(root.getData() ==node.getData())
        return true;
        return searchHelper(root.getLeft(), node) || searchHelper(root.getRight(), node);
    }
    public boolean searchByValue(Node node) {
        return searchByValueHelper(this.root, node);

    }
}
