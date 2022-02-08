import java.util.Scanner;

/**
 * Created by M.wadei on 02/02/2022.
 */
public class TestQueue {
    public static void main(String[] args) {
        ArrayQueue<Character> q = new ArrayQueue<>(5);
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <5; i++) {
            q.enqueue(input.next().charAt(0));
            System.out.println("Size = " + q.size());
            System.out.println("First = " + q.first());

        }

        for (int i = 0; i <6 ; i++) {
            System.out.print(q.dequeue() + "\t");

        }
    }
}
