package homepractice;

import java.util.Scanner;

/**
 * 11. Write a Java program to print the area and perimeter of a circle. Go to the editor
 * Test Data:
 * Radius = 7.5
 * Expected Output
 * Perimeter is = 47.12388980384689
 * Area is = 176.71458676442586
 */

public class No4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the radius of the circle :");
        /**
         *   perimeter = 2 * Math.PI * radius;
         *   area = Math.PI * radius * radius;
         */
         double radius = scan.nextDouble();
        System.out.println("perimeter is = " + (2 * Math.PI * radius));
        System.out.println("area is =" + (Math.PI * radius * radius));
        scan.close();
    }
}
