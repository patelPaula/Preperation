package homepractice;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to hexadecimal number. Go to the editor
 * Input Data:
 * Input a decimal number: 15
 * Expected Output
 * Hexadecimal number is : F
 */

public class No9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("convert a decimal number to hexadecimal number");
        int a = in.nextInt();
        System.out.println(Integer.toHexString(a));
        in.close();
    }
}
