package Frequently_Asked_Java_Programs;

//Palindrome number is a number that remains the same when its digits are reversed. Like 13431

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = scanner.nextInt();
        int org_num = num;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (org_num == rev) {
            System.out.println(org_num + "  Palindrome number  ");
        } else {
            System.out.println(org_num + "   Not Palindrome number ");
        }
        scanner.close();
    }
}
