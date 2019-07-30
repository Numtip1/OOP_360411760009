package lab3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        //if
        System.out.print("Enter an integer:");
        x = sc.nextInt();

//        if (x % 2 ==0)
//            System.out.println("this number is even");
//            System.out.println("Good bye");

            //if-lase
        if (x%2==0){
        if (x%4==0)
            System.out.println("this number is even.");
        } else {
            System.out.println("this number is odd.");
        }
            System.out.println("Good bye");




    }//main

}//class
