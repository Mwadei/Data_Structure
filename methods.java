import java.util.Scanner;

/**
 * Created by M.wadei on 10/01/2022.
 */
public class methods {

    public static void setArray(int[] a)
    {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
    }

    public static void printArray(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +"\t");
        }
    }

    public static void main(String[] args) {
        int[] b = new int[4];

        setArray(b);

        printArray(b);
    }
}
