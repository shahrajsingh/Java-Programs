
public class Binary_tree {
    static class Node {
        Node left;
        Node right;
        int data;

        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    static Node root;

    static void add(Node p,int d) {
        if(root == null){
            root = new Node(d);
            return;
        }else{
            if(p.left == null){
                p.left = new Node(d);
                return;
            }else if(p.right == null){
                p.right = new Node(d);
                return;
            }else{
                add(p.left,d);
                return;
            }
        }
    }
    static void printpreorder(Node r){
        if(root == null){
            System.out.println("empty tree");
            return;
        }else if(r == null){
            return;
        }
        else{
            System.out.print(r.data+",");
            printpreorder(r.left);
            printpreorder(r.right);
        }
    }
    static void postorder(Node r){
        if(root == null){
            return;
        }else if(r == null){
            return;
        }else{
                postorder(r.left);
                postorder(r.right);
                System.out.print(r.data+",");
        }
    }
    static void inorder(Node r){
        if(root == null){
            return;
        }else if(r == null){
            return;
        }else{
            inorder(r.left);
            System.out.print(r.data+",");
            inorder(r.right);
        }
    }
    static void levelorder(Node r){
        
    }
    public static void main(String[] args) {
        for (int a = 1; a < 6; a++) {
            add(root, a);
        }
        printpreorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
    }

}