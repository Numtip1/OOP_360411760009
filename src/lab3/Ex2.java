package lab3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Double testScore;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your numeric test score and I will tell you the grade:");
        testScore = sc.nextDouble();
        if(testScore <= 49.99)
            System.out.println("Your grade is F. ");
        else if(testScore <=54.99 )
            System.out.println("Your grade is D. ");
        else if(testScore <=59.99 )
            System.out.println("Your grade is D+. ");
        else  if (testScore <=64.99)
             System.out.println("you grade is C");
        else  if (testScore <=69.99)
            System.out.println("you grade is C+");
        else  if (testScore<=74.99)
            System.out.println("your grade is B");
        else  if (testScore<=79.99)
            System.out.println("your grade is B+");
        else  if (testScore>=80)
            System.out.println("you grade is A");
        else
            System.out.println("invalid score");








    }//main
}//class
