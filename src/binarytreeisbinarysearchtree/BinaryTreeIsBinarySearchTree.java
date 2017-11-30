/*

Write a method to check that a binary tree is a valid binary search tree.

 */
package binarytreeisbinarysearchtree;

/**
 *
 * @author Ali
 */
public class BinaryTreeIsBinarySearchTree 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Node root = new Node(20);
        root.left = new Node(15);
        root.right = new Node(22);
        root.left.left = new Node(13);
        root.left.right = new Node(17);
        root.right.left = new Node(21);
        root.right.right = new Node(26);
        
        System.out.println(isBST(root));
    }
    
    private static Boolean isBST(Node root)
    {
        //return if root is null
        //check if value of root is less than value of right child
        //check if value of root is greater than left child
        //
        if(root == null)
            return true;
        
        if(root.left != null)
        {
            if(!(root.left.data < root.data && isBST(root.left)) 
                || (root.left.data >= root.data))
                return false;
        }
        
        if(root.right != null)
        {
            if(!(root.right.data >= root.data && isBST(root.right))
                || (root.right.data < root.data))
                return false;
        }
        
        return true;
    }
    
}
