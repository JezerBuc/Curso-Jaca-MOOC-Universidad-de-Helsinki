
public class Main {

    public static void main(String[] args) {
        SimpleDate fechaJuan = new SimpleDate(25, 7, 1999);
        SimpleDate fechaVicky = new SimpleDate(25, 7, 1999);
        
        Person juan = new Person("Juan", fechaJuan, 199, 90);
        Person jhon = new Person("Jhon", new SimpleDate(13, 11, 2002), 187, 78);
        Person otroJuan = new Person("Juan", fechaVicky, 199, 90);
        
        if (juan.equals(jhon)){
            System.out.println("Las personas son iguales");
        }else {
            System.out.println("no son iguales");
        }
        
        if (otroJuan.equals(juan)){
            System.out.println("Las personas son iguales");   
        }else {
            System.out.println("no son iguales");
        }

        
    }//main
}//clase Main

/*
 Añade a la clase 
Persona el método public boolean equals (Objeto comparado),
que se puede utilizar para comparar la similitud de las 
personas. La comparación debe tener en cuenta la igualdad 
de todas las variables de una persona (cumpleaños incluido).

NOTA. Recuerda que no puedes comparar dos objetos de 
cumpleaños con signos de igualdad.


*/
