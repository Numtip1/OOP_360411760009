package Quiz1;

import javax.security.auth.Subject;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("name");
        String n = sc.nextLine();

        System.out.println("id");
        String i = sc.nextLine();

        System.out.println("major");
        String m = sc.nextLine();


        System.out.println("Supject A ?");
        String A = sc.nextLine();

        System.out.println("Supject B ?");
        String B = sc.nextLine();

        System.out.println("Supject C ?");
        String C = sc.nextLine();

        double g1 = compareGrade(A);
        double g2 = compareGrade(B);
        double g3 = compareGrade(C);

        double GPA = (g1 + g2 + g3) / 3.0;
        Student std1 = new Student(n, i, m, GPA);
        System.out.println(std1.toString());

    }//main

    private static double compareGrade(String A) {
        if (A.equals("A")) {
            return 4.00;
        } else if (A.equals("B+")) {
            return 3.5;
        }
        else if (A.equals("B")) {
            return  3.00;
        } else if (A.equals("c+")) {
            return  2.5;
        }
         else if (A.equals("c")) {
            return  2.00;
        } else if (A.equals("D+")) {
            return 1.5;
        }
         else if(A.equals("D")) {
            return  1.00;
        } else if (A.equals("f")) {
            return  0;
        }
            return 0.00;


        }

}
