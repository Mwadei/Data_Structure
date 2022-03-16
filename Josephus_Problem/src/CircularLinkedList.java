/**
 * Created by M.wadei on 12/02/2022.
 */
public class CircularLinkedList<E>{

    //create circulary linked list
    private Node tail;
    int size = 0;

    // Constructors
    public CircularLinkedList(E element) {
        this.tail = new Node(element, tail.getNext());
        size = 1;
    }

    public CircularLinkedList() {
        this.tail = new Node();
        this.tail.setNext(tail);
        size = 0;
    }

    // Methods
    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void rotate() // move current to the next node
    {
        tail = tail.next;
    }

    public void addNode(int element)  //add node to list
    {
        if (size == 0) {

            tail.element = element;
            tail.setNext(tail);
        } else {
            Node newest = new Node(element, tail.getNext());
            tail.setNext(newest);
            tail = newest;
        }
        size++;
    }

    public void delete() // delete node from list
    {
        if (size > 1) {
            Node temp = tail.getNext();
            System.out.println("player " + tail.getElement() + " is out");

            for (int i = 1; i <= (size - 1); i++) {
                tail = tail.getNext();
            }
            tail.setNext(temp);
            size--;
        }
        if (size == 1) {
            System.out.println("!! player " + tail.getElement() + " is the winner !!");
        }
    }

    public Node search(E key) // search for a node
    {
        int temp = size;
        while (temp != 0) {

            if (tail.getElement() == key) {
                break; // founded
            } else {
                tail = tail.getNext();
                temp--;
            }
        }
        if (temp > 1) {
            return tail;
        } else // if not found
        {
            throw new IllegalStateException("The node is not found");

        }
    }


    // Nested class
    public static class Node<E> {
        E element;
        Node next;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }

        public Node() {
        }

        public E getElement() {
            return element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
