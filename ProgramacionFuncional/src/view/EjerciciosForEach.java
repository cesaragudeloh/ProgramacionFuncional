package view;

import java.util.Arrays;
import java.util.List;


public class EjerciciosForEach {

    public static void main(String[] args) {
        List<String> lista1 = Arrays.asList("a","b","c","d","e","x");
        lista1.stream().forEach(n->{
           String r = n.toUpperCase();
            System.out.println(r);
        });

        lista1.stream().map(n->n.toUpperCase())
                       .forEach(n-> System.out.println(n));
    }



}
