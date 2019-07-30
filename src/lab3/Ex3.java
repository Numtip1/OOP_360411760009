package lab3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;
        int input =0;
        int avg;

        for (int i = 0; i < 10; i++) {
            System.out.print( " enter integer " +(i+1)+":");
            total += sc.nextInt(); //total = total +sc.nextInt ()

        }

        System.out.println("total vaiue:"+total);
        System.out.println("Average value"+(total/10));





    }//main
}//class
