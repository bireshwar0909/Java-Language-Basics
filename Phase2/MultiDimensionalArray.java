package Basics.Phase2;

import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre the number of rows");
        int a1 = sc.nextInt();
        System.out.println("Entre the number of columons");
        int a2 = sc.nextInt();

        // int a[][] = new int[a1][a2];
        // a1 arrays with size a2

        int a[][] = new int[a1][a2];

        //this peice of code will help to fill the array up
        System.out.println("Entre elements");
        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < a2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        //this peice of code will help to print the array up
        System.out.println("Your Matrix looks like- ");
        for (int i1 = 0; i1 < a1; i1++) {
            for (int j1 = 0; j1 < a2; j1++) {
                System.out.print(a[i1][j1] + " ");
            }
            System.out.println();
        }

        System.out.println("Entre the position of the Element of the matrix to get the value");
        int q0 = sc.nextInt();
        int q1 = sc.nextInt();
        System.out.println(a[q0 - 1][q1 - 1]);

        sc.close();
    }
}
