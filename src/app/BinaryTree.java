package app;

public class BinaryTree {
    Node root;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(11);
        tree.root.right.left.left = new Node(12);

        System.out.println("Inorder traversal");
        tree.inorder(tree.root);

        System.out.println("\nPreorder traversal ");
        tree.preorder(tree.root);

        System.out.println("\nPostorder traversal");
        tree.postorder(tree.root);
    }

    BinaryTree() {
        root = null;
    }

    // Неупорядкований обхід (Inorder traversal)
    void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.item + " ");
        inorder(node.right);
    }

    // Обхід передупорядкований (Preorder traversal)
    void preorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.item + " ");
        preorder(node.left);
        preorder(node.right);
    }

    //Обхід поступорядкований (Postorder traversal)
    void postorder(Node node) {
        if (node == null)
            return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.item + " ");
    }
}
