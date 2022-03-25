package com.yyh;
import java.util.Scanner;
public class F {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int count = sc.nextInt();
            int sum = 0;
            while(count > 0) {
                sum += sc.nextInt();
                count--;
            }
            System.out.println(sum);
        }
    }
}
