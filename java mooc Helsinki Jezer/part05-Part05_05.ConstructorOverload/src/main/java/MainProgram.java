
public class MainProgram {

    public static void main(String[] args) {
        Product prod = new Product("galletas");
        Product prod2 = new Product("frutas","USA");
        Product prod3 = new Product("Bicicletas",250);
        
        System.out.println(prod);
        System.out.println(prod2);
        System.out.println(prod3);
        
    }//main
}//clase Main

/*

shelf y 1

La plantilla de ejercicio tiene una clase Product, que representa 
un producto en una tienda. Cada producto tiene un nombre,
ubicación y peso.

Añadir los siguientes tres constructores a la Productclase:

public Product(String name)Crear un producto con el nombre dado.
Su ubicación está fijada para "estar la estanque" y su peso 
se establece en 1.*

public Product(String name, String location)Crear un producto 
con el nombre dado y la ubicación dada. 
Su peso se establece en 1.

public Product(String name, int weight)Crear un producto 
con el nombre dado y el peso dado. Su ubicación está configurada
para "estar a estancar".




salida:

Medida de la cinta (1 kg) se puede encontrar en la estantería
El yeso (1 kg) se puede encontrar en la sección de mejora del hogar
Tiro (5 kg) se puede encontrar desde la estantería


Tape measure (1 kg) can be found from the shelf
Plaster (1 kg) can be found from the home improvement section
Tyre (5 kg) can be found from the shelf
*/
