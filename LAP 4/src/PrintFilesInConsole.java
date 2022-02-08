import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by M.wadei on 02/02/2022.
 */
public class PrintFilesInConsole {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayQueue<String> q = new ArrayQueue<>(3);
        Scanner input = new Scanner(System.in);

        System.out.println("input path to print file");
        for (int i = 0; i <3 ; i++) {
            q.enqueue(input.next());
        }
        while (!q.isEmpty())
        {
            //System.out.println(q.dequeue());

            Scanner fileScanner = new Scanner(new File(q.dequeue()));
            while (fileScanner.hasNextLine())
            {
                System.out.println(fileScanner.nextLine());
            }
        }
    }
}
