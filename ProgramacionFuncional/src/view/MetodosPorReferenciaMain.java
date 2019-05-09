package view;

import model.Curso;
import model.MetodosPorReferencia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodosPorReferenciaMain {

    public static void main(String[] args) {
        MetodosPorReferencia mpr = new MetodosPorReferencia();
        System.out.println(mpr.obtenerCubos());

        //Referencia a métodos de instancia
         //Se instancia la clase y se llama con ::
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        lista.stream()
                .map(mpr::obtenerCubo2)
                .forEach(System.out::println);

        System.out.println("\nMétodo de Instancia de un objeto arbitrario:");
        mpr.imprimirTitulos();

        System.out.println("\nConstructor por referencia");
        mpr.imprimirListaUsuarios();


    }


}
