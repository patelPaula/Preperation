import java.util.Scanner;

public class JavaProgramme {


    public static void main(String[] args) {
        JavaProgramme javaProgramme = new JavaProgramme();
        javaProgramme.myMethod();}

    public void myMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("This is even number");
            System.out.println("1");
        } else {
            System.out.println("This is odd number");
            System.out.println("0");
            scanner.close();
        }

    }
}