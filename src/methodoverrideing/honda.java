package methodoverrideing;

public class honda extends car {
    //Honda inherits car
    // overriding the horn() method


    @Override
    public void horn() {
        System.out.println("car beep twice");
    }
    //new method in subclass
    public void colour(){
        System.out.println("car colour is silver");
    }
}
