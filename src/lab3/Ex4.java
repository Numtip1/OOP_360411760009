package lab3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total =0;
        int input =0;
        int avg;

        while (input >= 0) {
            System.out.print("enter integer:");
            input= sc.nextInt();
            if ( input >=0)
                total += input;
            else break;
        }
         System.out.println("total:"+total);









    }//main
}//class
