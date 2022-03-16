/**
 * Created by M.wadei on 23/02/2022.
 */
public interface Stack <E> {
    boolean isEmpty();
    int size();
    void push(E element);
    E pop();
    E top();

}
