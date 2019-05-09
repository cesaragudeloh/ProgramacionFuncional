package view;

import model.Matematicas;

public class MainMatematicas {

    public static void main(String[] args) {
        Matematicas math = new Matematicas();
        System.out.println("La suma es: "+math.sumar());
        System.out.println("La suma con Reduce es: "+math.sumarConReduce());
        System.out.println("El promedio es: "+math.promedio());
        System.out.println("El menor elemento es: "+math.menorElemento());
        System.out.println("El mayor elemento es: "+math.mayorElemento());
        System.out.println("String separado: "+math.separarElementos());
        System.out.println("Lista ordenada ascendente: "+math.ordenarListaAscendente());
        System.out.println("Lista ordenada descendente: "+math.ordenarListaDescendente());
    }
}
