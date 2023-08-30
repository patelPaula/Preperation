package homepractice;

import java.util.Scanner;

/**
 * 13. Write a Java program to print the area and perimeter of a rectangle. Go to the editor
 * Test Data:
 * Width = 5.6 Height = 8.5
 * Expected Output
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class No5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System .in);
        System.out.println("enter the Width of a rectangle");
        System.out.println("enter the Height of a rectangle");
       float width = in.nextFloat();
       float height = in.nextFloat();
        /**
         *  perimeter = 2*(height + width);
         * area = width * height
         */
        System.out.println("Area is =" + width * height);
        System.out.println("perimeter is =" + 2*(height + width));
        in.close();

    }
}
