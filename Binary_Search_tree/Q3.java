package Binary_Search_tree;
import java.util.HashMap;


/*

3. You have a binary tree with n nodes. You are given binary trees pre-order and in-order. Create an algorithm to formulate post-order. For example:

int[] a = {4,2,1,3,5}; // pre-order

int[] b = {2,4,3,1,5}; // in-order

int[] c = formulatePostOrder(a,b);

System.out.println(Arrays.toString(c)); // [2, 3, 5, 1, 4]
*/


class TreeNode {
    int val;
    TreeNode left, right;
    public TreeNode(int val) {
        this.val = val;
    }
}



public class Q3 {
    private int preIndex = 0;
    
    // Builds a binary tree based on PreOrder and inorder traversals
    public TreeNode buildTree(int[] PreOrder, int[] inOrder) {
        HashMap<Integer, Integer> inOrderMap = new HashMap<>();
        for (int i = 0; i < inOrder.length; i++) {
            inOrderMap.put(inOrder[i], i);
        }
        return buildTreeHelper(PreOrder, inOrder, 0, inOrder.length - 1, inOrderMap);
    }


    // Helper function for building the binary tree recursively
    private TreeNode buildTreeHelper(int[] PreOrder, int[] inOrder, int inStart, int inEnd, HashMap<Integer, Integer> inOrderMap) {
        if (inStart > inEnd) {
            return null;
        }
// A new TreeNode using the current PreOrder element
        TreeNode root = new TreeNode(PreOrder[preIndex++]);
        int inIndex = inOrderMap.get(root.val);

        root.left = buildTreeHelper(PreOrder, inOrder, inStart, inIndex - 1, inOrderMap);
        root.right = buildTreeHelper(PreOrder, inOrder, inIndex + 1, inEnd, inOrderMap);

        return root;
    }


    // Performs postorder traversal and prints the values
    public void postorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        int[] PreOrder = {1,2,4,3,5,6,7,8};
        int[] inOrder = {4,2,1,5,3,7,6,8};

        Q3 treeBuilder = new Q3(); // Create an instance of Q3 class
        TreeNode root = treeBuilder.buildTree(PreOrder, inOrder);

        System.out.print("Post-order: ");
        treeBuilder.postorderTraversal(root);
    }
}


// I tested using PreOrder = {4, 2, 1, 3, 5}; and int[] inOrder = {2, 4, 3, 1, 5};
// Output Post-order was {2 3 5 1 4}

// Then I took the value from lecture note and Post-order result was {4 2 5 7 8 6 3 1 }