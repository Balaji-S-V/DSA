class BST
{
    class Node
    {
        int key;
        Node left,right;

        public Node(int data)
        {
            key = data;
            left = right = null;

        }
        //BST 
    }
    Node root;
    BST()
    {
        root = null;
    }
    void insert(int key)
    {
        insert_Recursive(root,key);
    }
    Node insert_Recursive(Node root,int key)
    {
        if(root == null)
        {
            root = new Node(key);
            return root;
        }
        if(key <root.key)
            root.left = insert_Recursive(root.left, key);
        else if(key > root.key)
            root.right = insert_Recursive(root.right, key);
        return root;

    }
    void inorder()
    {
        inorder_recursion(root);
    }
    void inorder_recursion(Node root)
    {
        if (root != null)
        {
            inorder_recursion(root.left);
            System.out.println(root.key+" ");
            inorder_recursion(root.right);
        }
    }
    void postorder()
    {
        postorder_recursion(root);
    }
    void postorder_recursion(Node root)
    {
        if (root != null)
        {
            inorder_recursion(root.left);
            inorder_recursion(root.right);
            System.out.println(root.key+" ");
        }
    }
}
public class BSTdfs
{
        public static void main(String[] args) {
            BST bst = new BST();
            bst.insert(1);
            bst.insert(2);
            bst.insert(3);
            bst.insert(4);
            bst.insert(5);
            bst.insert(6);
            bst.inorder();

        }
}
