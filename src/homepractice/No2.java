package homepractice;

import java.util.Scanner;

/**
 * 7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
 *         Test Data:
 *         Input a number: 8
 *         Expected Output :
 *         8 x 1 = 8
 *         8 x 2 = 16
 *         8 x 3 = 24
 *         ...
 *         8 x 10 = 80
 */

public class No2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Input a number ");
//        int num1 = input.nextInt();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(num1 + " x " + (i + 1) + "=" + (num1 * (i + 1)));
//
//            input.close();
//
//
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int num1 = scanner.nextInt();
        for(int i =0; i<10; i++){
            System.out.println(num1 + " x " + (i + 1)+ " = " +(num1 * (i + 1)));
            scanner.close();
        }
    }




}




