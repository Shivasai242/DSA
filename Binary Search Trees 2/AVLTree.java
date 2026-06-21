public class AVLTree {
    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.height = 1;
        }
    }
    public static Node root;

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return root.height;
    }

    static int max(int a, int b){
        return (a > b) ? a : b;
    }

    public static Node insert(Node root, int key){
        if(root == null){
            return new Node(key);
        }
        if(key < root.data){
            root.left = insert(root.left, key);
        }else if(key > root.data){
            root.right = insert(root.right, key);
        }
        else{
            return root;  //Duplicate keys not allowed
        }
        //update root height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        //get root's balance factor
        int bf
    }
    
    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;
        public Info(boolean isBST, int size, int min, int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static  int maxBST = 0;
    public static Info largestBST(Node root){
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));


        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false, size, min, max);
        }
        if(leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);



    }
    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);            
        root = insert(root, 30);
        root = insert(root, 40);    
        root = insert(root, 50);
        root = insert(root, 25);

        /*
                     AVL Tree

                        30
                       /   \
                     20     40
                   /   \   /   \
                  10   25 50

        */

        preorder(root);
        System.out.println();

    }
    
}
