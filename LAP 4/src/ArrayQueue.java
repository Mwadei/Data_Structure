/**
 * Created by M.wadei on 02/02/2022.
 */
public class ArrayQueue<E> implements Queue<E> {

    final static int CAPACITY = 100;
    E[] data;
    int front = 0, sz = 0;

    public ArrayQueue(int c) {
        data = (E[]) new Object[c];
    }

    public ArrayQueue() {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return sz == 0;
    }

    @Override
    public int size() {
        return (sz);
    }

    @Override
    public void enqueue(E element) {
        if (size() == data.length)
            throw new IllegalStateException("Queue is full");

        int i = ((front + size()) % data.length);
        data[i] = element;
        sz++;

    }

    @Override
    public E dequeue() {
        if (isEmpty()) return null ;

        E del = data[front];
        data[front]= null;
        front=((front+1)% data.length);
        sz--;

        return del;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;

        return data[front% data.length];
    }
}
