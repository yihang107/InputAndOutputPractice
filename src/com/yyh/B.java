package com.yyh;
import  java.util.Scanner;

public class B {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
            t--;
        }
    }
}
