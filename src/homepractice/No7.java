package homepractice;

import java.util.Scanner;

/**
 *  Write a Java program to add two binary numbers. Go to the editor
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output
 * Sum of two binary numbers: 101
 */

public class No7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st binary number");
       String a = in.next();
        System.out.println("enter 2nd binary number");
        String b = in.next();
        int n1 = Integer.parseInt(a, 2);
        int n2 = Integer.parseInt(b, 2);
        int n3 =n1 + n2;
        System.out.println("n3 = n1 + n2:" + Integer.toBinaryString(n3) );
        in.close();



    }
}
