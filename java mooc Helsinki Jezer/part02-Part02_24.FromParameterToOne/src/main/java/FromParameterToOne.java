

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(4);


    }//main
    
    public static void printFromNumberToOne(int number){
        
       
        while( number>=1){
            System.out.println(number);
            number--;
            
            
        }
        
        /*
        for(int i=number; i>=1; i--){
            System.out.println(i);
            
        }
        
        */
        
    }

}//class


/*
Crear el siguiente método en la plantilla de ejercicio: public static void printFromNumberToOne(int number).
Debería imprimir el número pasado como parámetro hasta uno. A continuación se dan dos ejemplos del uso del método.

public static void main(String[] args) {
    printFromNumberToOne(5);
}

Salida de la muestra

5
4
3
2
1

*/