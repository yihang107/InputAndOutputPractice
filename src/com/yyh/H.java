package com.yyh;
import java.util.Arrays;
import java.util.Scanner;
public class H {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int strCount = sc.nextInt();
        String[] str = new String[strCount];
        for (int i = 0; i < strCount; i++) {
            str[i] = sc.next();
        }
        Arrays.sort(str);
        for (int i = 0; i < strCount; i++){
            System.out.print(str[i] + " ");
        }
    }
}
