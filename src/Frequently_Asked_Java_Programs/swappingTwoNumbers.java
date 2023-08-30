package Frequently_Asked_Java_Programs;

public class swappingTwoNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before swapping values are "+a+"  "+b);

         //Using third variable Logic 1
       /* int t = a;
        a=b;
        b=t;*/

        //Logic 2 using + & - opretores

        a=a+b; //10+20=30
        b=a-b; //30-20=10
        a=a-b; //30-10=20

        System.out.println("After swapping values are "+a+"  "+b);
    }
}
