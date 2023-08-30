package homepractice;

import java.util.Scanner;

/**
 * 15. Write a Java program to swap two variables.
 */

public class No6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System .in);
        System.out.println("inpur number 1");
        int a = in.nextInt();
        System.out.println("input number 2");
        int b = in.nextInt();
        System.out.println("before swaping =" + a + ";" + b);
        int ab;
        ab = a;
        a = b;
        b = ab;
        System.out.println("after swaping =" + a + ";" + b);


    }
}
