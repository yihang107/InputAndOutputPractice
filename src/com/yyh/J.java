package com.yyh;
import java.util.Arrays;
import java.util.Scanner;
public class J {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String totalString = sc.nextLine();
            String[] sArray = totalString.split(",");
            Arrays.sort(sArray);
            for(String str : sArray) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
