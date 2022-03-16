/**
 * Created by M.wadei on 23/02/2022.
 */
public interface Queue <E> {
    boolean isEmpty();
    int size();
    void enqueue (E element);
    E dequeue();
    E first ();
}
