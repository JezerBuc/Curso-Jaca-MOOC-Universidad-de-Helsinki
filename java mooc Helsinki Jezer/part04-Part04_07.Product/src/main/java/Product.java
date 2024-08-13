/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbuc_
 */
public class Product {
    private double precio;
    private int cantidad;
    private String nombre;
    
    public Product( String name,double price,int quantity){
        
        this.precio = price;
        this.cantidad = quantity;
        this.nombre = name;
    }//constructor
    
    
    public void printProduct(){
        System.out.println(nombre+" price "+ precio + cantidad + "  pcs");
    }
    
    
}//clase Producto

/*
Crear una clase ProductEso representa un producto de tienda. 
El producto debe tener un precio (doble), una cantidad (int) 
y un nombre (String).

La clase debería tener:

    el constructor public Product (String initialName, 
double initialPrice, int initialQuantity)
    un método public void printProduct()Esto imprime 
la información del producto en el siguiente formato:


Salida de la muestra
Banana, precio 1.1, 13 piezas
La salida se basa en el producto asignado al nombre banana, 
con un precio de 1.1, y una cantidad de 13.

Sample output
Banana, price 1.1, 13 pcs

*/
