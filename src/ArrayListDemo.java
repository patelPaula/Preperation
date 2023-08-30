import java.util.ArrayList;

public class ArrayListDemo {

    ArrayList a1 = new ArrayList();

    public void listElements() {
        a1.add("Axika");
        a1.add("Bhavisha");
        a1.add(10);
        a1.add(true);
        a1.add(null);
        a1.add(10.675);
        // System.out.println(a1);


    }

    public void listElements1(){

    ArrayList S2 = new ArrayList<>();
        S2.add("Paulomi");
        S2.add(true);
        S2.add('M');
        S2.add(13.04);
        for(Object a1 :S2)
        {
        System.out.println(a1);
        }

        for(Object S1 :a1)

    {

        System.out.println(S1);
    }

        a1.remove(5);
        System.out.println(a1);
    }
public static void main(String[] args) {
        ArrayListDemo obj = new ArrayListDemo();
        obj.listElements();
        obj.listElements1();
    }
}
