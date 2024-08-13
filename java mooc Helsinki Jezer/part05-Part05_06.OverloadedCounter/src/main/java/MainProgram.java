
public class MainProgram {

    public static void main(String[] args) {
        Counter x = new Counter();
        Counter y = new Counter(2);
        Counter z = new Counter(5);
        
        x.increase();//devuelve2
        y.increase(22);//devuelve 24
        z.increase();//devuelve 6
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
        x.decrease(2);//devuelve 0
        y.decrease();//devuelve 23
        z.decrease(5);//devuelve 1
        
        
        
        
        
        
    }//main
}//mainProgram

/*
Múl-constructores

Implementar una clase llamada Counter. La clase contiene un número 
de valor puede (incrementarse y decrementerse.) La clase debe tener 
los siguientes constructores:

public Counter(int startValue)Estace el valor de inicio del 
mostrador para iniciarValue.

public Counter()El valor de inicio del contador de 0.

Y los siguientes métodos:

public int value()devuelve el valor actual del contador
public void increase()El valor en 1
public void decrease()disminuye el valor en 1

Métodos alternativos

Las versiones de ejecución reciben un parámetro de los métodos 
increaseY decrease.

public void increase(int increaseBy)El valor del contador 
por el valor de aumentoBy. Si el valor de aumentoBy es negativo, el valor del contador no cambia.

public void decrease(int decreaseBy)disminuye el valor del
contador por el valor de la disminución de: Si el valor de la disminuciónBy es negativo, el valor del contador no cambia.


*/
