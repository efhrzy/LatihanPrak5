public class BinaryTree {

    Node root;

    public void newNode(int data){
        root = newNode(root, new Node(data));
    }

    private Node newNode(Node root, Node newData) {

        if (root == null){
            root = newData;
            return root;
        }
        if (newData.data < root.data){
            root.left = newNode(root.left, newData);
        } else {
            root.right = newNode(root.right, newData);
        }
        return root;
    }

    void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    void preOrder(Node node){
        if (node != null){
            preOrder(node.left);
            System.out.print(node.data + " ");
            preOrder(node.right);
        }
    }
    void postOrder(Node node){
        if (node != null){
            postOrder(node.right);
            System.out.print(node.data + " ");
            preOrder(node.left);
        }
    }
}
