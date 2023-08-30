public class NoReturnWithperameters {
    public static void main(String[] args) {
        myTown("London", "Leicester");
        NoReturnWithperameters obj = new NoReturnWithperameters();
        obj.myCity("Harrow","Wembley");

    }

    public static void myTown(String a, String b){

        System.out.println(a + b);
    }

    public void myCity( String c, String d){
        System.out.println(c + d);
    }
}
