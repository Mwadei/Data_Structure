/**
 * Created by M.wadei on 23/02/2022.
 */
public class LinkedStack<E> implements Stack<E> {
   SinglyLinkedList<E> list = new SinglyLinkedList<E>();
   @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void push(E element) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E top() {
        return null;
    }
}
