import java.util.LinkedList;
import java.util.Queue;

public class A009BST{
    private BSTNode root = null ;
    public BSTNode insert(BSTNode root , int data ){
        if(root == null){
            root = new BSTNode(data);
        }else if(data < root.data){
            root.left = insert(root.left, data);
        }else{
            root.right = insert(root.right, data);
        }
        return root;
    }

    public boolean search(BSTNode root , int data){
        if(root == null){
            return false;
        }else if(root.data == data){
            return true;
        }else if(data < root.data ){
            return search(root.left , data);
        }else {
            return search(root.right , data );
        }
    }

    public int findMin(BSTNode root){
        if(root == null){
            return -1 ;
        }else {
            while(root.left != null){
                root = root.left;
            }
            return root.data ;
        }
    }

    public int findMax(BSTNode root){
        if(root == null ){
            return -1 ;
        }else {
            while (root.right != null){
                root = root.right;
            }
            return root.data;
        }
    }

    public int findHeight(BSTNode root){
        if(root == null){
            return -1 ; 
        }else{
            return max(findHeight(root.left) , findHeight(root.right))+ 1 ;
        }
    }

    public int max(int o1 , int o2 ){
        return o1 >= o2 ? o1 : o2 ;
    }

    public void breathFirstTraversal(BSTNode root){
        Queue<BSTNode> q = new LinkedList<>();
        if(root == null){
            return;
        }else{
           System.out.print(root.data+"-> ");
           q.add(root.left );
           q.add(root.right);
           while(!q.isEmpty()){
               breathFirstTraversal(q.remove());
           }
        }      
    }

    public void preOrderTraversal(BSTNode root){
        if(root == null) return;
        else{
            System.out.print(root.data+"->");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public void inOrderTraversal(BSTNode root){
        if(root == null){return;}
        else{
            inOrderTraversal(root.left);
            System.out.print(root.data+"->");
            inOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(BSTNode root){
        if(root == null ){return;}
        else{
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data+"->");
        }
    }

    public BSTNode delete(BSTNode root , int data){
        if(root == null) return root;
        if(data < root.data){
            root.left = delete(root.left , data);
        }else if(data > root.data ){
            root.right = delete(root.right, data);
        }else{
            //found the element now delete it 
            //Case 1: no child , delete the node
            if(root.left == null && root.right == null){
                root = null;
            //Case 2 : single child is present 
            }else if(root.left == null){
                root = root.right;
            }else if (root.right == null ){
                root = root.left;
            }else{
                //Case 3: both the childern are present 
                //so find the min in right tree / find max in left tree 
                //copy it in the current node and call delete in the selected tree
                int newMin = findMin(root.right);
                root.data = newMin;
                root.right = delete(root.right, newMin);
            }
        }
        return root;
    }


    // java A009BST 1
    public static void main(String[] args) {
        A009BST bst = new A009BST();
        bst.root = bst.insert(bst.root, 15);
        bst.root = bst.insert(bst.root, 10);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 40);bst.root = bst.insert(bst.root, 30);bst.root = bst.insert(bst.root, 50);
        int s = Integer.parseInt(args[0]);
        System.out.println(s+" is Present? "+bst.search(bst.root, s));
        System.out.println("Minimum in BST: "+bst.findMin(bst.root));
        System.out.println("Maximum in BST: "+bst.findMax(bst.root));
        System.out.println("Height of BST : "+bst.findHeight(bst.root));
        System.out.println("the tree traversed in BREATH IS : ");
        bst.breathFirstTraversal(bst.root);
        System.out.println("\nthe tree traversed in PREORDER IS : ");
        bst.preOrderTraversal(bst.root);

        int deleteValue = 15 ;
        bst.delete(bst.root, deleteValue);

        System.out.println("\nthe tree traversed in INORDER IS : ");
        bst.inOrderTraversal(bst.root);
        System.out.println("\nthe tree traversed in POSTORDER IS : ");
        bst.postOrderTraversal(bst.root);
        

    }

    private class BSTNode {
        int data ;
        BSTNode left ; 
        BSTNode right ;
        BSTNode(){
            this.data = 0;
            this.left = null;
            this.right = null;
        }
        BSTNode(int data){
            this.data = data; 
            this.left = null;
            this.right = null;
        }
    }
}