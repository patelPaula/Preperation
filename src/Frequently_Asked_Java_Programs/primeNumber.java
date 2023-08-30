package Frequently_Asked_Java_Programs;
//Natural Number > 1
// Which has only 2 factors 1 and itself
//1,3,5,7 prime number
//2,4,6,8 not prime number


public class primeNumber {
    public static void main(String[] args) {

        int num = 7;
        int count = 0;

        if (num > 1) {

            for (int i=1;i<=num;i++){
                if (num%i ==0)
                    count++;
            }
            if(count==2) {
                System.out.println("Prime Number");
            }
            else {
                System.out.println("Not a Prime Number");
            }

        }
        else {
            System.out.println("Not Prime Number");
        }
    }
}