package com.advanced.dsa.dataStructures.nonLinear.trees.traversals.dfs;
// dfs -> depth first search
public class Node {
    int data; // the data of the node
    Node left; // the address of the left child
    Node right; // the address of the right child
    Node (int data){
        this.data = data;
        this.left = this.right = null; // Node has no children initially
    }
    public static void preOrder(Node root){  // DLR
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void InOrder(Node root){ // LDR
        if (root != null){
            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
        }
    }
    public static void PostOrder(Node root) { // LRD
        if (root != null) {
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main (String[]ags){
        // construct a binary tree
        // we must construct the tree from
        // Top --> Bottom, Left --> Right, Level by level
        // Level-0
        Node root = new Node(1);
        // Level-1
        root.left = new Node(2);
        root.right = new Node(3);
        // Level-2
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // Level-3
        root.left.right.left = new Node(9);
        root.right.right.left = new Node(15);
        System.out.println("Preorder Traversal");
        preOrder(root);
        System.out.println();
        System.out.println("Inorder Traversal");
        InOrder(root);
        System.out.println();
        System.out.println("Postorder Traversal");
        PostOrder(root);
        System.out.println();
    }
}

