package com.yyh;
import java.util.Scanner;
public class G {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            int sum = 0;
            String s = sc.nextLine();
            String str[] = s.split(" ");
            for(String numStr : str) {
                sum += Integer.parseInt(numStr);
            }
            System.out.println(sum);
        }
    }
}
