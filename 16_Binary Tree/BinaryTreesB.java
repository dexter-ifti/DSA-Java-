import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreesB {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;
        }

        public static void preorder(Node root) { // root --> left --> right
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inoreder(Node root) {  // left --> root --> right
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            inoreder(root.left);
            System.out.print(root.data);
            inoreder(root.right);
        }
        public static void postorder(Node root) {  // left --> right --> root 
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelorder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                     q.add(currNode.right);   
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root =  tree.buildtree(nodes);
        // System.out.println(root.data);;

        // tree.preorder(root);
        // tree.inoreder(root);
        // tree.postorder(root);
        tree.levelorder(root);
    }
}
