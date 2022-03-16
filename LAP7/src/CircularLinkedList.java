/**
 * Created by M.wadei on 23/02/2022.
 */
public class CircularLinkedList<E> {

    private Node<E> tail=null;
    private int size =0;

    public boolean isEmpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }

    public E first()
    {
        if (isEmpty()) return null;

        return tail.getNext().getElement();
    }

    public E last()
    {
        if (isEmpty()) return null;

        return tail.getElement();
    }

    public void addFirst(E element)
    {
        if (size==0)
        {
            tail = new Node<E>(element,null);
            tail.setNext(tail);
        }
        else
        {
            Node<E> newest = new Node<E>(element,tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }
    public void addLast(E element)
    {
        addFirst(element);
        tail = tail.getNext();
    }

    public E removeFirst()
    {
        if (isEmpty()) return null;

        Node<E> x = tail.getNext();
        if (x==tail)
        {
            tail = null;
        }
        else tail.setNext(x.getNext());
        size--;
        return x.getElement();
    }

    public void rotate()
    {
        if (tail!=null)
            tail=tail.getNext();
    }



    private static class Node<E>
    {
        E element;
        Node next;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
