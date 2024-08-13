
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics(){
    
    }//constructor 
    
    
    public void addNumber(int number){
        this.count++;  
        this.sum+=number;  
    }//metodo añadir numero
    
    public int getCount(){
        return this.count;
        
    }//devolver numeros añadidos
    
    public int sum() {
        return sum;
    }//sum
    
    public double average(){
        if(this.sum !=0 && this.count !=0){
            return (double)this.sum/this.count;
            
        }else {
            return 0;
        }//if
    }//metodo retorna el promedio
    
    
    /*
    NOTA: Define tres objetos de estadística en el programa.
    Utiliera el primero para calcular la suma de todos los
    números, el segundo para calcular la suma de números pares,
    y el tercero para calcular la suma de números impares.
    
    
    Enter numbers:
    4
    2
    5
    2
    -1
    Sum: 13
    Sum of even numbers: 8
    Sum of odd numbers: 5
    */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}//clase Estadisticas

/*

Parte 2: Expansión de la clase Statistics

    Agregar funcionalidades a la clase Statistics:
        Un método sum() que indique la suma de los números añadidos.
        Un método average() que indique el promedio de los números añadidos.

    Detalles:
        En el constructor de la clase, inicializa también la variable sum.
        addNumber(int number): Incrementa tanto el conteo como la suma de números añadidos.
        sum(): Devuelve la suma de los números añadidos.
        average(): Devuelve el promedio de los números añadidos. Si no hay números añadidos, debe devolver 0.

Parte 3: Programa que usa la clase Statistics

    Crear un programa que:
        Pida al usuario que ingrese números hasta que ingrese -1.
        Use un objeto de Statistics para calcular la suma de los números.

    Detalles:
        No modifiques la clase Statistics para esta parte.
        El programa debe imprimir la suma de los números ingresados por el usuario.

Parte 4: Múltiples sumas

    Modificar el programa anterior para calcular también:
        La suma de todos los números.
        La suma de números pares.
        La suma de números impares.

    Detalles:
        Define tres objetos de Statistics:
            Uno para la suma de todos los números.
            Otro para la suma de números pares.
            Otro para la suma de números impares.
        Usa estos objetos en el orden mencionado.
        No cambies la clase Statistics para esta parte.

    Salida esperada del programa:

*/
