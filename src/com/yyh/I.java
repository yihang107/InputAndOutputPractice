package com.yyh;
import java.util.Arrays;
import java.util.Scanner;
public class I {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] sArray = s.split(" ");
            Arrays.sort(sArray);
            for (String str : sArray) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
