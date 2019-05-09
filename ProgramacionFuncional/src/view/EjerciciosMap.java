package view;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjerciciosMap {


    public static void main(String[] args) {
        //Generar una lista de números enteros apartir de una lista de Strings ya existente.
        List<String> lista1 = Arrays.asList("1","2","3","4","5","69");
        List<Integer>  newList1 = lista1.stream()
                                 .map(n->Integer.parseInt(n))
                                 .collect(Collectors.toList());
        System.out.println(lista1);
        System.out.println(newList1);


        //Imprimir en consola los strings con todas sus letras en mayúsculas.
        List<String> lista2 = Arrays.asList("a","b","c","d","e","x");
        List<String> newList2 = lista2.stream()
                                .map(x->x.toUpperCase())
                                .collect(Collectors.toList());
        System.out.println(lista2);
        System.out.println(newList2);


        //Generar una lista de valores booleanos los cuales hagan referencia a
        //las calificaciones de los alumnos. La calificación minima aprovatoria es 6.

        List<Integer> notas = Arrays.asList(4,10,3,9,1,0,10,6,10,3,5,7);
        List<Boolean> calificaciones = notas.stream()
                                       .map(x->x>5)
                                       .collect(Collectors.toList());
        System.out.println(notas);
        System.out.println(calificaciones);
    }


}
