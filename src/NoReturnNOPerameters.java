public class NoReturnNOPerameters {
    public static void main(String[] args) {
        NoReturnNOPerameters obj = new NoReturnNOPerameters();
        obj.myMethod1(); // 1. Instance calling
        myMethod();      // 2. Static Calling

    }
    public static void myMethod(){      // 1. static Method
        int a= 10;
        int b = 20;
        int ans = a + b;

        System.out.println(ans);
    }

    public void myMethod1(){         // 2 . Instance method

        double c = 10.23;
        double d = 66.34;
        double ans = d-c;

        System.out.println(ans);     // 56.11


    }
}
