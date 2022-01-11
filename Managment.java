import java.util.Scanner;

/**
 * Created by M.wadei on 10/01/2022.
 */
public class Managment {
    public static void main(String[] args) {
        Student[] team = new  Student[3];
        /*Student s1 = new Student(1 , "mohammed");
        team[0] = s1;

        Student s2 = new Student(1 , "qaed");
        team[1] = s2;

        Student s3 = new Student(1 , "ahmed");
        team[2] = s3;*/

        for (int i = 0; i <team.length ; i++) {
            Scanner in =new Scanner(System.in);
            Student s1 = new Student(in.nextInt() , in.next());
            team[i] = s1;
        }

        for (int i = 0; i <team.length ; i++) {
            System.out.println(team[i].toString());
        }
    }
}
