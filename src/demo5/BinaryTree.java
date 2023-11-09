package demo5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
public class BinaryTree<T> {
    private TreeNode<T> root;
    class TreeNode<T> {
        private T value;
        private TreeNode lNode,rNode;

        public TreeNode() {
        }

        public TreeNode(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public TreeNode getlNode() {
            return lNode;
        }

        public void setlNode(TreeNode lNode) {
            this.lNode = lNode;
        }

        public TreeNode getrNode() {
            return rNode;
        }

        public void setrNode(TreeNode rNode) {
            this.rNode = rNode;
        }
    }

    public BinaryTree() {
    }

    public boolean put(T value){
        if(root == null){
            root = new TreeNode<>(value);
        }
        TreeNode<T> node = root;
        while (true){
            Object nodeValue = node.getValue();
            if(nodeValue.hashCode() > value.hashCode()){
                if(node.lNode == null){
                    node.lNode = new TreeNode<T>(value);
                    return true;
                }
                node = node.lNode;
            }else if (nodeValue.hashCode() == value.hashCode()){
                return false;
            }else {
                if(node.rNode == null){
                    node.rNode = new TreeNode<T>(value);
                    return true;
                }
                node = node.rNode;
            }
        }

    }

    public void display(T node){
        System.out.print("前序遍历 : ");
        ArrayList<T> pre = new ArrayList<>();
        complete = false;
        print(root, 0, node, pre);
        System.out.println(pre);
        System.out.print("中序遍历 : ");
        ArrayList<T> mid = new ArrayList<>();
        complete = false;
        print(root, 1, node, mid);
        System.out.println(mid);
        System.out.print("后序遍历 : ");
        ArrayList<T> late = new ArrayList<>();
        complete = false;
        print(root, 2, node, late);
        System.out.println(late);
    }
    private static boolean complete = false;
    public void print(TreeNode root, int x, T node, List<T> list){
        if(complete){
            return;
        }
        if(root == null){
            return;
        }
        if(root.value.equals(node)){
            list.add((T) root.value);
            complete = true;
            return;
        }
        if(x == 0){
            list.add((T) root.value);
        }
        print(root.lNode,x,node,list);
        if(complete){
            return;
        }
        if(x == 1){
            list.add((T) root.value);
        }
        print(root.rNode,x,node,list);
        if(complete){
            return;
        }
        if(x == 2){
            list.add((T) root.value);
        }
    }
    public void display(){
        /*System.out.print("前序遍历 : ");
        print(root,0,null);
        System.out.println("");
        System.out.print("中序遍历 : ");
        print(root,1,null);
        System.out.println("");
        System.out.print("后序遍历 : ");
        print(root,2,null);
        System.out.println("");*/
    }
}
