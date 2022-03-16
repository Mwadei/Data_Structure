import java.util.Scanner;

/**
 * Created by M.wadei on 02/03/2022.
 */
public class TestMain {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        Scanner input = new Scanner(System.in);

        int choice = -1;

        System.out.println("1 add first \t 2 add last \t 3 remove first \t 4 remove last \t 0 exit");

        while (choice != 0) {
            System.out.println("choose an operation:");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a name");
                    list.addFirst(input.next());
                    break;
                case 2:
                    System.out.println("Enter a name");
                    list.addLast(input.next());
                    break;
                case 3:
                    System.out.println(list.removeFirst() + " removed");
                    break;
                case 4:
                    System.out.println(list.removeLast() + " removed");
                    break;
                case 0:
                    break;
            }
            System.out.println("first: " + list.first() + "\t last: " + list.last() + "\t size: " + list.size());
        }
    }
}
