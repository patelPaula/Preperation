package homepractice;

import java.util.Scanner;

/**
 * Write a Java program to multiply two binary numbers. Go to the editor
 * Input Data:
 * Input the first binary number: 10
 * Input the second binary number: 11
 * Expected Output
 * Product of two binary numbers: 110
 */
public class No8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st binary number");
        String a = in.next();
        System.out.println("enter 2nd binary number");
        String b = in.next();
        int n1 = Integer.parseInt(a, 2);
        int n2 = Integer.parseInt(b, 2);
        int n3 = n1 * n2;
        System.out.println("n3 = n1 * n2 :" + Integer.toBinaryString(n3));
        in.close();
    }
}
