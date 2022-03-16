import java.util.Scanner;
/**
 * Created by M.wadei on 16/02/2022.
 */
public class TestSinglyList {
    public static void main(String[] args) {
        SinglyLinkedList<String> list =new SinglyLinkedList<>();
        Scanner in = new Scanner(System.in);
        int choice=-1;

        System.out.println("1 add first\t 2 add last \t 3 remove first \t 4 remove all \t 0 exit");
        while(choice!=0)
        {
            System.out.println("your choice:");
            choice=in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("input name");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.println("input name");
                    list.addLast(in.next());
                    break;
                case 3:
                    System.out.println("removed: " + list.removeFirst());
                    break;
                case 4 :
                    while (!list.isEmpty())
                        System.out.println(list.removeFirst()+"\t");
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
            System.out.println("first= " + list.first() + "\t last = "+list.tail()+"\tsize= " + list.size());
        }
    }
}
