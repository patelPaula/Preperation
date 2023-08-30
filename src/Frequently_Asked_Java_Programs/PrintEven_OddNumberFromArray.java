package Frequently_Asked_Java_Programs;

public class PrintEven_OddNumberFromArray {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5,6};
        //Enhance for loop
        for (int value : a){
            if(value%2==0)
                System.out.println("Even number in array.........");
            System.out.println(value);
        }
        for (int value : a){
            if (value%2!=0)
                System.out.println("Odd number in array..........");
            System.out.println(value);
        }
    }


}
