package inheritance;

public class main {
    public static void main(String[] args) {
        //create object for subclass
        dog tommy = new dog();

        //access field of superclass
        tommy.name = "Ricky";
        tommy.display();

        //call method of superclass
        //using object of superclass
        tommy.eat();
    }
}
