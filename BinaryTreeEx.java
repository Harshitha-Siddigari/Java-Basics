package javaproject1;
class TreeNode {
    String name;
    TreeNode left, right;
    TreeNode(String name) {
        this.name = name;
        left = right = null;
    }
}
public class BinaryTreeEx {
    TreeNode root;
    void printRoot() {
        if (root != null)
            System.out.println("Root: " + root.name);
    }
    void printChildren(TreeNode node) {
        if (node == null) return;
        System.out.println("Node: " + node.name);
        System.out.println("Left Child: " + (node.left != null ? node.left.name : "null"));
        System.out.println("Right Child: " + (node.right != null ? node.right.name : "null"));
    }
    int countNodes(TreeNode node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }
    int countLeafNodes(TreeNode node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null)
            return 1;
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }
    void printInOrder(TreeNode node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.name + " ");
        printInOrder(node.right);
    }
    TreeNode mirror(TreeNode node) {
        if (node == null) return null;
        TreeNode temp = node.left;
        node.left = mirror(node.right);
        node.right = mirror(temp);
        return node;
    }
    void printPaths(TreeNode node, String path) {
        if (node == null) return;
        path += node.name + " ";
        if (node.left == null && node.right == null) {
            System.out.println("Path: " + path);
        } else {
            printPaths(node.left, path);
            printPaths(node.right, path);
        }
    }
    boolean isEmpty() {
        return root == null;
    }

    public static void main(String[] args) {
        BinaryTreeEx tree = new BinaryTreeEx();
        tree.root = new TreeNode("Mom");
        tree.root.left = new TreeNode("Dad");
        tree.root.right = new TreeNode("You");

        tree.printRoot();
        tree.printChildren(tree.root);
        System.out.println("Total Nodes: " + tree.countNodes(tree.root));
        System.out.println("Leaf Nodes: " + tree.countLeafNodes(tree.root));
        System.out.print("In-order Traversal: ");
        tree.printInOrder(tree.root);
        System.out.println();

        System.out.println("Mirroring tree...");
        tree.mirror(tree.root);
        System.out.print("In-order After Mirror: ");
        tree.printInOrder(tree.root);
        System.out.println();

        System.out.println("All Paths:");
        tree.printPaths(tree.root, "");

        System.out.println("Is tree empty? " + tree.isEmpty());
    }
}