package Frequently_Asked_Java_Programs;

public class ReversString {
    public static void main(String[] args) {
        String string = "Today is Friday";
        String reversStr = "";

        for(int i = string.length()-1;i>=0;i--){
           reversStr = reversStr + string.charAt(i);
       }

        System.out.println("Original String : " + string);
        System.out.println("Revers of given String : " + reversStr);

        //2nd programme

        String string1 = "Hello";
        String reversedStr = "";

        for(int i = string1.length()-1;i>=0;i--) {
            reversedStr = reversedStr + string1.charAt(i);
        }
        System.out.println("Original String : " + string1);
        System.out.println("Reverse is : " + reversedStr);
    }


    }

