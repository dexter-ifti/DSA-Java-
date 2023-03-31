import java.util.ArrayList;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // insert at left
            root.left = insert(root.left, val);
        } else {
            // insert at right
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right); 
    }
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
    public static Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }
        else if (root.data > val) {
            root.left = delete(root.left, val);
        }
        else if (root.data < val) {
            root.right = delete(root.right, val);
        }

        else {
            // case 1 
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 
            else if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
            else {
                Node IS = inorderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            }
        }
        return root;
    }
    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        }
        else {
            printInRange(root.right, k1, k2);
        }
    }
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+ " ->");
        }
        System.out.println("Null");
    }
    public static void printRoot2LeafPath(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }

        printRoot2LeafPath(root.left, path);
        printRoot2LeafPath(root.right, path);
        path.remove(path.size()-1);
    }
    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        }
        else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root)
                && isValidBST(root.right, root, max);
    }
    public static void main(String[] args) {
        // int values[] = {5, 1, 3, 4, 2, 7};
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        // if (search(root, 6)) {
        //     System.out.print("Found");
        // } else {
        //     System.out.print("Not Found");
        // }

        // root = delete(root, 5);
        // inorder(root);
        // printInRange(root, 5, 12);
        // printRoot2LeafPath(root, new ArrayList<>());
        if (isValidBST(root, null, null)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}
