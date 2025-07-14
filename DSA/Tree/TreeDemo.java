package DSA.Tree;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class TreeDemo {

    // 1. Sample Tree
    static TreeNode buildSampleTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        return root;
    }

    // 2. Inorder Traversal (Left, Root, Right)
    static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    // 3. Preorder Traversal (Root, Left, Right)
    static void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // 4. Postorder Traversal (Left, Right, Root)
    static void postorder(TreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val + " ");
        }
    }

    // 5. Level Order (BFS)
    static void levelOrder(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            System.out.print(node.val + " ");
            if (node.left != null) q.offer(node.left);
            if (node.right != null) q.offer(node.right);
        }
    }

    // 6. Max Depth
    static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    // 7. Is Balanced
    static boolean isBalanced(TreeNode root) {
        return checkBalance(root) != -1;
    }

    static int checkBalance(TreeNode node) {
        if (node == null) return 0;
        int left = checkBalance(node.left);
        int right = checkBalance(node.right);
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) return -1;
        return 1 + Math.max(left, right);
    }

    // 8. Lowest Common Ancestor (LCA)
    static TreeNode lca(TreeNode root, int a, int b) {
        if (root == null || root.val == a || root.val == b) return root;
        TreeNode left = lca(root.left, a, b);
        TreeNode right = lca(root.right, a, b);
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }

    // 9. Diameter of Binary Tree
    static class Diameter {
        int max = 0;
        int diameter(TreeNode root) {
            height(root);
            return max;
        }

        int height(TreeNode node) {
            if (node == null) return 0;
            int left = height(node.left);
            int right = height(node.right);
            max = Math.max(max, left + right);
            return 1 + Math.max(left, right);
        }
    }

    // 10. Insert into BST
    static TreeNode insertBST(TreeNode root, int key) {
        if (root == null) return new TreeNode(key);
        if (key < root.val) root.left = insertBST(root.left, key);
        else root.right = insertBST(root.right, key);
        return root;
    }

    // 11. Check if Two Trees Are Identical
    static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    // Main method to test everything
    public static void main(String[] args) {
        TreeNode root = buildSampleTree();

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();

        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();

        System.out.print("Level Order: ");
        levelOrder(root);
        System.out.println();

        System.out.println("Max Depth: " + maxDepth(root));
        System.out.println("Is Balanced: " + isBalanced(root));

        TreeNode ancestor = lca(root, 4, 5);
        System.out.println("LCA of 4 and 5: " + (ancestor != null ? ancestor.val : "null"));

        Diameter d = new Diameter();
        System.out.println("Diameter: " + d.diameter(root));

        TreeNode bst = null;
        for (int val : new int[]{50, 30, 20, 40, 70, 60, 80}) {
            bst = insertBST(bst, val);
        }
        System.out.print("BST Inorder: ");
        inorder(bst);
        System.out.println();

        TreeNode clone = buildSampleTree();
        System.out.println("Is Same Tree: " + isSameTree(root, clone));
    }
}
