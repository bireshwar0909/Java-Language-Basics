package Basics.Phase2;

import java.util.Scanner;                                           //in order to get this pattern
public class PatternLearing {                                      
    public static void main(String[] args){                         //*
        Scanner sc = new Scanner(System.in);                        //* *
        int n = sc.nextInt();                                       //*  *
        if (n == 1){                                                //*    *
            System.out.println("Hey get a number bigger then 1");   //* * * * *
        } else {
            System.out.println("*");                                    
        for(int i=2; i<=n-1; i++){                                  
            System.out.print("*  ");

            for(int j=1; j<=i-2; j++){
                System.out.print("  ");
            }
            System.out.println("*");
        }
        for(int i = 1; i<=n; i++){
            System.out.print("* ");
        }
        }                          
    sc.close();            
        
    }
}