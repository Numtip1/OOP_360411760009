package lab3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;
        int input = 0;
        int count =0;

        do {
        System.out.print("enter integer:");
        input = sc.nextInt();
        if (input >= 0) {
            total += input;
            count++;
        }
        }while (input>=0);

        System.out.println("total:"+total);
        System.out.println("Average:"+(total/count));


    }//main
}//class
