package groupjavaconatinationpractice;

import java.util.Scanner;

public class Calculater {

    public void addition(){
        Scanner scan = new Scanner(System . in);
        System.out.println("enter first name");
        int firstname = scan .nextInt();
        System.out.println("enter second name");
        int secondname = scan.nextInt();
        System.out.println("enter third name");
        int thirdname = scan.nextInt();
        System.out.println("enter fouth name");
        int forthname = scan.nextInt();
        int sum = firstname+secondname+thirdname+forthname;
        System.out.println("sum of all number:-" + sum);

    }
    public static void substraction(){
        Scanner scan = new Scanner(System . in);
        System.out.println("enter first name");
        int firstname = scan .nextInt();
        System.out.println("enter second name");
        int secondname = scan.nextInt();
        System.out.println("enter third name");
        int thirdname = scan.nextInt();
        System.out.println("enter fouth name");
        int forthname = scan.nextInt();
        int substraction = firstname-secondname-thirdname-forthname;
        System.out.println("sum of all number:-" + substraction);

    }

    public void multiplication(){
        Scanner scan = new Scanner(System . in);
        System.out.println("enter first name");
        int firstname = scan .nextInt();
        System.out.println("enter second name");
        int secondname = scan.nextInt();
        System.out.println("enter third name");
        int thirdname = scan.nextInt();
        System.out.println("enter fouth name");
        int forthname = scan.nextInt();
        int multiplication = firstname*secondname*thirdname*forthname;
        System.out.println("sum of all number:-" + multiplication);


    }
    public static void division(){
        Scanner scan = new Scanner(System . in);
        System.out.println("enter first name");
        int firstname = scan .nextInt();
        System.out.println("enter second name");
        int secondname = scan.nextInt();
        System.out.println("enter third name");
        int thirdname = scan.nextInt();
        System.out.println("enter fouth name");
        int forthname = scan.nextInt();
        int divison = firstname/secondname/thirdname/forthname;
        System.out.println("sum of all number:-" + divison);
        scan.close();

    }

    public static void main(String[] args) {
        Calculater add = new Calculater();
        add.addition();
        add.multiplication();
        substraction();
        division();

    }
}
