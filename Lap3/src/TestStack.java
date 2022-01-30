import java.util.Scanner;

/**
 * Created by M.wadei on 24/01/2022.
 */
public class TestStack {
    public static void main(String[] args) {
        ArrayStack<Integer>myStack=new ArrayStack<>(5);
        Scanner input = new Scanner(System.in);
        System.out.println("Is stack empty? : "+ myStack.isEmpty());
        System.out.println("input elements");

        for (int i = 0; i < 5; i++) {
            myStack.push(input.nextInt());
            System.out.println("top element is = " + myStack.top());
            System.out.println("stack size is = " + myStack.size());
            System.out.println("is the stack empty? : " + myStack.isEmpty() );
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("Deleted element = " + myStack.pop());
            System.out.println("top element is = " + myStack.top());
            System.out.println("stack size is = " + myStack.size());
            System.out.println("is the stack empty? : " + myStack.isEmpty() );
        }

    }
}
