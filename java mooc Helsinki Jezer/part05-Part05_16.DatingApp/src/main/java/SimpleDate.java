
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }//constructor (3 parametros)


    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }//if

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }//if

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }//if

        return false;
    }//before
    
    public void advance() {
        if (this.day == 30) {
            this.day = 1;
            
            if (this.month == 12) {
                this.year++;
                this.month=1;
            } else {
                this.month++;
            }
        } else {
            this.day++;
        }

    }//advance
    
     public void advance(int howManyDays){
         for(int i=0; i<howManyDays; i++){
             advance();
         }         
    }//advance
     
     public SimpleDate afterNumberOfDays(int days){
         SimpleDate newFecha = new SimpleDate(this.day, this.month, this.year);
         
         for (int i=0; i<days; i++){
             newFecha.advance();         
         }  
         return newFecha;
         
    }//afterNumberOfDays

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }//toString

}//clase fecha simple
