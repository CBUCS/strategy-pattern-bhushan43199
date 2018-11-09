import java.util.Scanner;


class BinaryNode
{
    BinaryNode left, right;
    int data;

    // Creating Constructor
    public BinaryNode()
    {
        left = null;
        right = null;
        data = 0;
    }


    // Creating Constructor

    public BinaryNode(int n)
    {
        left = null;
        right = null;
        data = n;
    }


    // Setting Left Node


    public void setLeft(BinaryNode n)
    {
        left = n;
    }




    // Setting Right Node


    public void setRight(BinaryNode n)
    {
        right = n;
    }


    // Getting Left Node


    public BinaryNode getLeft()
    {
        return left;
    }


    // Getting Right Node


    public BinaryNode getRight()
    {
        return right;
    }


    // Set Data to Node


    public void setData(int d)
    {
        data = d;
    }


    // Get Data TO Node


    public int getData()
    {
        return data;
    }
}


class BT
{
    private BinaryNode root;

    /* Constructor */
    public BT()
    {
        root = null;
    }


    // Empty Check


    public boolean isEmpty()
    {
        return root == null;
    }


    // Insert Data


    public void insert(int data)
    {
        root = insert(root, data);
    }


    // Recursive Data


    private BinaryNode insert(BinaryNode node, int data)
    {
        if (node == null)
            node = new BinaryNode(data);
        else
        {
            if (node.getRight() == null)
                node.right = insert(node.right, data);
            else
                node.left = insert(node.left, data);
        }
        return node;
    }


    // Count Node


    public int countNodes()
    {
        return countNodes(root);
    }


    // Count nodes recursively


    private int countNodes(BinaryNode r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }


    // Search


    public boolean search(int val)
    {
        return search(root, val);
    }


    //Search element recursively


    private boolean search(BinaryNode r, int val)
    {
        if (r.getData() == val)
            return true;
        if (r.getLeft() != null)
            if (search(r.getLeft(), val))
                return true;
        if (r.getRight() != null)
            if (search(r.getRight(), val))
                return true;
        return false;
    }


    //inorder traversal


    public void inorder()
    {
        inorder(root);
    }
    private void inorder(BinaryNode r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    }


    // preorder traversal


    public void preorder()
    {
        preorder(root);
    }
    private void preorder(BinaryNode r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }


    //postorder traversal */


    public void postorder()
    {
        postorder(root);
    }
    private void postorder(BinaryNode r)
    {
        if (r != null)
        {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() +" ");
        }
    }
}

