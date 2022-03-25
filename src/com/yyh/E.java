package com.yyh;
import java.util.Scanner;
public class E {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int rowCount = sc.nextInt();
        while(rowCount > 0) {
            int numCount = sc.nextInt();
            int sum = 0;
            while(numCount > 0) {
                sum += sc.nextInt();
                numCount--;
            }
            System.out.println(sum);
            rowCount--;
        }
    }

}
