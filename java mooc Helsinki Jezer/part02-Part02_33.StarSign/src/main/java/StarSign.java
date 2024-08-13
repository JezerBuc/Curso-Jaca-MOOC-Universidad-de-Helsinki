
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
        //mi prueba
       
        
    }

    public static void printStars(int number) {
        

        for(int i=0; i<number; i++){
            System.out.print("*");  
        }//for
        System.out.println("");

    }//printStars
    

    public static void printSquare(int size) {

        for(int i=0; i<size; i++){
            printStars(size);
          
        }//for

    }//printSquare
    
    
    public static void printRectangle(int width, int height) {
        
        //17w  3h
        
        for (int i=0; i<height; i++){
            printStars(width);
     
        }
       
        
   
    }//printRectangle

    public static void printTriangle(int size) {
       
        
        for(int i=0; i<=size; i++){
            printStars(i);
        }
 
    }//printTriangle
    
    
    
}//class


/*
Impresión de un triángulo

Crear un método llamado printTriangle(int size)Eso imprime un triángulo usando el printStarsmétodo.
Así que la llamada printTriangle(4)En caso de imprimir lo siguiente:
Salida de la muestra
*
**
***
****

*/