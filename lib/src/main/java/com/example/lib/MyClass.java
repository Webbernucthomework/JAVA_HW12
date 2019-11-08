package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("請輸入數字");
        int In = scan.nextInt();
        for(int i=In;i>0;i--){
            for(int k=In-i ;k>0;k--){
                System.out.print(" ");
            }
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
