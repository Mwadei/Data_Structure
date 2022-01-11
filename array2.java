import java.util.Scanner;

/**
 * Created by M.wadei on 10/01/2022.
 */
public class array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = new int[9];

        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +"\t");
        }
    }
}
