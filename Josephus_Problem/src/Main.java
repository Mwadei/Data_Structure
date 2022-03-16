import java.util.Scanner;

/**
 * Created by M.wadei on 14/02/2022.
 */
public class Main  {


    public static void main(String[] args) {
        int playersNo , countOff , startPosition;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter players number:");
        playersNo = input.nextInt();
        System.out.print("Enter CountOff:");
        countOff = input.nextInt();
        JosephusProblem<Integer> players = new JosephusProblem(playersNo , countOff);

        System.out.println("-------------");

        players.problemSolution();

    }
}
