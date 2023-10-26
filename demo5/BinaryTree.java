package demo5;

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

    public void display(){
        System.out.println("前序遍历 : ");
        print(root,0);
        System.out.println("");
        System.out.print("中序遍历 : ");
        print(root,1);
        System.out.println("");
        System.out.print("后序遍历 : ");
        print(root,2);
        System.out.println("");

    }
    public void print(TreeNode root,int x){
        if(root == null){
            return;
        }
        if(x == 0){
            System.out.print(root.value + " ");
        }
        print(root.lNode,x);
        if(x == 1){
            System.out.print(root.value + " ");
        }
        print(root.rNode,x);
        if(x == 2){
            System.out.print(root.value + " ");
        }
    }
}
