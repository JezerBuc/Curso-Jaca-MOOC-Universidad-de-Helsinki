

public class Division {

    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        division(3, 5);
    }

    public static void division(int numerador, int denominador){
        double resultado = (double)numerador/denominador;
        System.out.println(resultado);
    }
}


/*
Escriba un método public static void division(int numerator, int denominator)Eso imprime el resultado de la
división del numerador por el denominador. Mantén en mente que el resultado de la división de los
números enteros es un número entero en este caso queremos que el resultado sea un número de punto flotante.

public static void main(String[] args) {
    division(3, 5);
}

Salida de la muestra

0,6

*/