package Lab1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("What's your name ?:");
        String name = scanner.nextLine();
        System.out.println(name);



        System.out.print("็Hown old are you ?:");
        int old = scanner1.nextInt();
        System.out.println(old);

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Email ?");
        String Email = scanner.nextLine();
        System.out.println(Email);




    }//main

}//class
