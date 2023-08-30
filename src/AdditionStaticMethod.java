import java.util.Scanner;

public class AdditionStaticMethod {


    public static void myMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number");
        int b = scanner.nextInt();
        System.out.println("The answer is :" + (a + b));

    scanner.close();
    }

    public static void main(String[] args) {
        myMethod();


    }
}
