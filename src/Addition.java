import java.util.Scanner;

public class Addition {
    public void myMethod(int a,int b){
        int ans = a+b;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number");
        int n1 = scanner.nextInt();
        System.out.println("Enter 2nd number");
        int n2 = scanner.nextInt();
        Addition addition = new Addition();
        addition.myMethod(n1,n2);
        scanner.close();
    }

}
