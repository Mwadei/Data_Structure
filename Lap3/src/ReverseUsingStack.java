import java.util.Arrays;

/**
 * Created by M.wadei on 24/01/2022.
 */
public class ReverseUsingStack {
    public static void main(String[] args) {
        int[] a = {11,12,13,14,15};
        ArrayStack<Integer> myStack= new ArrayStack<>(a.length);

        for (int i = 0; i < a.length; i++) {
            myStack.push(a[i]);

        }
        for (int i = 0; i <a.length ; i++) {
            a[i]=myStack.pop();

        }
        System.out.println("after reverse using stack");
        System.out.println(Arrays.toString(a));
    }
}
