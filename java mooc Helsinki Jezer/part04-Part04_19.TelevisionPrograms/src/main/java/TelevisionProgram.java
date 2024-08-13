
public class TelevisionProgram {

    private String name;
    private int duration;

    public TelevisionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }// constructor

    public boolean isAwesome() {
        return this.name.contains("MasterChef");
    }// retorna true si el nombre es MasterChef, falso si no

    public String getName() {
        return name;
    }//get Name

    public int getDuration() {
        return duration;
    }//get Duration

    @Override
    public String toString() {
        return this.name + ", " + this.duration + " minutes";
    }//toString
}//clase Programa de Televisión
