package lab7;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("carbrandName");
        String a = sc.nextLine();

        System.out.println("carcalor");
        String b = sc.nextLine();

        System.out.println("carenginesize");
        String c = sc.nextLine();

        System.out.println("maxspeed");
        String d = sc.nextLine();

        System.out.println("countryoforigin");
        String e = sc.nextLine();



      SuperCar car1 = new SuperCar(a,b,c,d,e);
      car1 .getSuperinto();
    }



}
