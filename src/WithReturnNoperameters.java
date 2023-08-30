public class WithReturnNoperameters {
    public static void main(String [] args){
       int ans = addition();
        System.out.println(ans);
        WithReturnNoperameters obj = new WithReturnNoperameters();
        int ans1 = obj.divison();
        System.out.println(ans1);
    }

    public static int addition(){

        int a = 123456;
        int b = 3;
        int ans = a+b;
        return ans;
    }

    public int divison(){
        int a = 123456;
        int b = 3;
        int ans1 = a/b;
        return ans1;

    }
}


