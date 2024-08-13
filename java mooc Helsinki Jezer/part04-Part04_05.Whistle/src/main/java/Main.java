
public class Main {

    public static void main(String[] args) {
        Whistle pajaritoSilbido = new Whistle("pio pio");
        Whistle patoSilbido = new Whistle("quak quak");
        Whistle galloSilbido = new Whistle("kikiriki");
        Whistle guapeteSilbido = new Whistle("fiu fiu");
        
        pajaritoSilbido.sound();
        patoSilbido.sound();
        galloSilbido.sound();
        guapeteSilbido.sound();
        
        

        
    }//main
}//class main

/*
Crear una clase de nombre Whistle. Añadir la variable private String sounda la clase. 
Después de eso, crear el constructor public Whistle(String whistleSound), que se utiliza para crear un 
nuevo silbato que se le da un sonido.

Entonces crea el método public void sound()Eso imprime el sonido del silbato.


// the Whistle class. Try for example:
Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

       duckWhistle.sound();
       roosterWhistle.sound();
       duckWhistle.sound();

*/
