package pilas;

public class MainPilas {
    public static void main(String[] args) {
        System.out.println("********Ejercicio Balanceo de Paréntesis*************");

        BalanceoParentesis balanceo = new BalanceoParentesis();

        String expresion1 = "( ( a + b ) * c )";
        String expresion2 = "( ( a + b ) * c ";

        System.out.println("Expresión 1: " + expresion1);
        System.out.println("¿Está balanceado? " + balanceo.estaBalanceado(expresion1));

        System.out.println("--------------------------------------");

        System.out.println("Expresión 2: " + expresion2);
        System.out.println("¿Está balanceado? " + balanceo.estaBalanceado(expresion2));

        System.out.println("--------------------------------------");


        System.out.println("********Ejercicio Call Stack*************");

        CallStack pila = new CallStack();
        pila.InicializarPila();


        String funcion1 = "main()";
        System.out.println("Apilo: " + funcion1);
        pila.Apilar(funcion1);

        String funcion2 = "calcularPromedio()";
        System.out.println("Apilo: " + funcion2);
        pila.Apilar(funcion2);

        String funcion3 = "sumar()";
        System.out.println("Apilo: " + funcion3);
        pila.Apilar(funcion3);

        System.out.println("--------------------------------------");
        System.out.println("Tope actual:" + pila.Tope());
        System.out.println("--------------------------------------");

        System.out.println("Desapilo: " + pila.Tope());
        pila.Desapilar();

        System.out.println("Desapilo: " + pila.Tope());
        pila.Desapilar();

        System.out.println("Desapilo: " + pila.Tope());
        pila.Desapilar();

        System.out.println("--------------------------------------");
        System.out.println("********Ejercicio ReversionString****************");

        ReversionStrings reversor = new ReversionStrings();

        String palabra = "ALGORITMOS";

        System.out.println("Palabra a invertir: " + palabra);

        String resultado = reversor.revertirstring(palabra);

        System.out.println("Invertida: " + resultado);







    }
}
