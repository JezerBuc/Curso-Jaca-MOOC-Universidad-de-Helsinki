
public class Main {

    public static void main(String[] args) {
        // you can write code here for testing your program

        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song theIntro = new Song("Rogzz", "The intro", 700);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }//if

        if (jackSparrow.equals(theIntro)) {
            System.out.println("Strange things are afoot.");
        }//if
    }//main
}//clse Main

/*
El ejercicio es una clase llamada SongEso se puede utilizar 
para crear nuevos objetos que representan las canciones. 
Añadir a esa clase equalsmétodo para que se pueda examinar 
la similitud de las canciones.

*/