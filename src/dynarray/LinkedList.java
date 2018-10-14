package dynarray;

public class LinkedList {

    Node first;
    int size;
    
    public LinkedList() {
        size = 0;
        first = null;
    }
    
    public void add(int value) {
        Node node = new Node(value);
        
        if (first == null) {
            first = node;
            return;
        }

        // Finding the last node
        Node last = first;
        while(last.getNext() != null) {
            last = last.getNext();
        }
//        for (int i = 0; i < size; i++) {
//            last = last.getNext();
//        }
        last.setNext(node);
        size++;
    }
}
