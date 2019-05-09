package view;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjerciciosFlatMap {

    public static void main(String[] args) {
        //unir varias listas en una sola

        List<String> lista1 = Arrays.asList("A","B","C");
        List<String> lista2 = Arrays.asList("D","F","G");
        List<String> lista3 = Arrays.asList("Andrea","Bibiana","Cesar");
        List<String> lista4 = Arrays.asList("There","Those","Much","How");

        List<String> newList = Stream.of(lista1,lista2,lista3,lista4)
                                     .flatMap(x->x.stream())
                                     .collect(Collectors.toList());
        System.out.println(newList);
    }
}
