package lab_5;

import java.util.Scanner;

public class Ex4  {
    public static void main(String[] args) {
        int num [][] = new int [2][3];

        input (num);
        outData (num);
        findaverage (num);
        findmax (num);
        findmin (num);

    }//main

    private static void findmin(int[][] num) {
        int min = num[0][0];
        for (int i =0; i<num.length; i++) { //loop row
            for (int j = 0; j < num[i].length; j++) {//loop column

                if (min > num[i][j]) {
                    min = num[i][j];
                }
            }
        }
        System.out.println("findmin:" + min);


    }

    private static void findmax(int[][] num) {
        int max = num[0][0];
        for (int i =0; i<num.length; i++) { //loop row
            for (int j = 0; j < num[i].length; j++) {//loop column

                if (max < num[i][j]) {
                    max = num[i][j];
                }
            }
        }
        System.out.println("Maximum:" +max);
    }

    private static void findaverage(int[][] num) {
        int total = 0;
        int count =0; //count = num.length*num [].length

        int x = num.length*num [0].length;

        for (int i =0; i<num.length; i++) { //loop row
            for (int j = 0; j < num[i].length; j++) {//loop column
                total += num[i][j];
                count++;
            }

                System.out.println("Average value"+(total/count));
                System.out.print("averrage;" + total/x);
            }
        }



    private static void input(int[][] num) {
        Scanner sc = new Scanner(System.in);

        for (int i =0; i<num.length; i++) { //loop row
            for (int j = 0; j < num[i].length; j++) {//loop column
                System.out.print("Enter num [" + i + "] [" + j + "]:");
                num[i][j] = sc.nextInt();
            }
        }}

    private static void outData(int[][] num) {
        System.out.println( " Data in Array:");


        for (int i = 0; i< num.length ; i++){
            for ( int j = 0; j < num [i].length ; j++){
                System.out.print(num [i][j]+ "\t");


    }
    }
            }
    }


