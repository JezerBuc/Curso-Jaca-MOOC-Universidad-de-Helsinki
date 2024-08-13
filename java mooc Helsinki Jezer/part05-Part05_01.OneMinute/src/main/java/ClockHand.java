
public class ClockHand {

    private int value;
    private int limit;

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }//constructor

    public void advance() {
        this.value = this.value + 1;

        if (this.value >= this.limit) {
            this.value = 0;
        }//if
    }//metodo advance

    public int value() {
        return this.value;
    }//metodo retorna value 

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }//if

        return "" + this.value;
    }//toString
    
}//clase clock Hand
