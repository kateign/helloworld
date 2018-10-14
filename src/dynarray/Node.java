package dynarray;

public class Node {

    private final int value;
    private Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
    
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }
    
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
