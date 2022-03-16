import java.util.Scanner;

/**
 * Created by M.wadei on 23/02/2022.
 */

public class TestQueue {
    public static void main(String[] args) {
        LinkedQueue<Character> q=new LinkedQueue<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("THe queue is Empty "+q.isEmpty());
        System.out.println("Pleas Enter the queue element ");
        for (int i = 0; i < 5; i++) {
            q.enqueue(scanner.next().charAt(0));
            System.out.println("first element is " +q.first());
            System.out.println("Size = "+q.size());
        }
        while(!q.isEmpty())
        {
            System.out.print(q.dequeue()+"\t");
        }
    }
}
