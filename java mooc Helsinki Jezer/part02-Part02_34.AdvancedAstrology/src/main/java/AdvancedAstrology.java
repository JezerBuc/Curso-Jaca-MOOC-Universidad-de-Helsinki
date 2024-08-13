
public class AdvancedAstrology {

    public static void printStars(int number) {
        for(int i=0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }//printStars

    public static void printSpaces(int number) {
        for (int i=0; i < number; i++){
            System.out.print(" ");
        }
    }//printSpaces

    public static void printTriangle(int size) {
        for(int i=1; i<=size; i++){
            printSpaces(size-i);
            printStars(i);
            
            
        }//for
        
        /*
        
        cuando imprimo printSpaces(size) devuelve esto: 
---        
     *
     **
     ***
     ****
     *****
---
        
      cuando imprimo printSpaces(size-i) los invierte:
---      
    *
   **
  ***
 ****
*****
---
        
        */
        
      
    }//printTriangle

    public static void christmasTree(int height) {
        
        for(int i=1; i<=height; i++){
            printSpaces(height-i);
            printStars(2*i-1); 
        }//for
        
        for(int i=1; i<3; i++){
            printSpaces(height-2);
            printStars(3);
        }
        
        
        
        /*
        christmasTree(4);
        Definir un método llamado christmasTree(int height)Eso imprime el árbol de Navidad correcto. 
        El árbol de Navidad consiste en un triángulo con la altura especificada, así como la base. 
        La base tiene dos estrellas de altura y tres estrellas de ancho, y se coloca 
        en el centro del fondo del triángulo. El árbol debe estar usando los métodos printSpaces Y 
        printStars.

Por ejemplo, la llamada christmasTree(4)En caso de imprimir lo siguiente:
        
   *
  ***
 *****
*******
  ***
  ***
        
        */
    }//christmasTree

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }//main
    
    
}//class AdvancedAstrology
