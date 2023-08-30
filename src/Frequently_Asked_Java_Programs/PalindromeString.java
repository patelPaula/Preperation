package Frequently_Asked_Java_Programs;
//A Palindrome String is a String that remains the same when its characters are reversed. Like MADAM

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");

        String str = scanner.next();
        String org_str = str;

        String rev = " ";

        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (org_str.equals(rev)) {
            System.out.println(org_str + "Is a Palindrome String");
        } else {
            System.out.println(org_str + "Is not a Palindrome String");
        }
    }
}
