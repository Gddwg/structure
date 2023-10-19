package demo2;

public class LinkList<R> {
    private Node first;
    private Node last;

    public LinkList() {
    }

    class Node{
        R data;
        Node next;
    }

    public void add(R data){
        if(this.first != null){
            Node node = new Node();
            node.data = data;
            this.last.next = node;
            this.last = node;
        }else {
            Node node = new Node();
            node.data = data;
            this.first = node;
            this.last = node;
        }
    }

    public void show(){
        Node node = this.first;
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public int exits(R data){
        int count = 0;
        Node node = this.first;
        while (node != null) {
            if (node.data.equals(data)) {
                count++;
            }
            node = node.next;
        }
        return count;
    }

}
