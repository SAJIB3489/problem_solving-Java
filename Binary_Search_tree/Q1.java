package Binary_Search_tree;
import java.util.Random;

/*
     1. Create a binary search tree that holds in numbers
        from 1 to 1 000 000. What is the height of binary search
        tree when you add numbers randomly to binary tree?
        Implement pseudo code from binary search tree pdf to BinaryTree class.
         Use random to add random numbers and check height.

 */



public class Q1 {

    // Node class represents a node in the binary search tree
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        // Method to calculate the height of a node in the tree
        int height(Node node) {
            if (node == null) {
                return -1;
            }
            return 1 + Math.max(height(node.left), height(node.right)); //// Recursive case: calculate height as 1 + maximum height of left and right subtrees
        }

        void insert(int data) {
            root = insertRec(root, data);
        }

        Node insertRec(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }

            if (data < root.data) {
                root.left = insertRec(root.left, data);
            } else if (data > root.data) {
                root.right = insertRec(root.right, data);
            }

            return root;
        }
    }

    // Here is the Main method to demonstrate the binary search tree functionality
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Random random = new Random();

        for (int i = 1; i <= 1000000; i++) {
            int randomNumber = random.nextInt(1000000) + 1;
            tree.insert(randomNumber);
        }

        int treeHeight = tree.height(tree.root);
        System.out.println("Binary search tree Height is: " + treeHeight);
    }
}


// For Randomly Built Binary Search Trees, I got the idea from below website
// https://algorithmtutor.com/Data-Structures/Tree/Randomly-Built-Binary-Search-Trees/