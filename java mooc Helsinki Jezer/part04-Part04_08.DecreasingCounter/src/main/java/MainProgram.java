
public class MainProgram {

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();
        counter.decrement();
        counter.decrement();
        
        counter.reset();

    }//main
}//clase MainProgram


/*
    DecreasingCounter counter = new DecreasingCounter(10);

    counter.printValue();
    counter.decrement();
    counter.decrement();

*/