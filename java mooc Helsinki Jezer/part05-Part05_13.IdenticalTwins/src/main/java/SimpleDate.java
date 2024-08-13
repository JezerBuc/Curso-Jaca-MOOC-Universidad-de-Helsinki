
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }//constructor (dia,mes,año)

    public int getDay() {
        return this.day;
    }//getDay

    public int getMonth() {
        return this.month;
    }//getMes

    public int getYear() {
        return this.year;
    }//getAño

    public boolean equals(Object compared) {
        // if the variables are located in the same place, they are the same.
        if (this == compared) {
            return true;
        }//if retorna true si las variables son iguales

        // if the object is not instance of SimpleDate, the objects are not the same
        if (!(compared instanceof SimpleDate)) {
            return false;
        }//if retorna false si no son iguales

        // convertimos el objeto comparado al tipo objeto SimpleDate
        SimpleDate otherDate = (SimpleDate) compared;

        
        if (this.day == otherDate.day
                && this.month == otherDate.month
                && this.year == otherDate.year) {
            return true;
        }// si los valores de los objetos son iguales, son lo mismo

        // other wise, the objects are not the same
        return false;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }//toStrinf 
}//clase Fecha simple
