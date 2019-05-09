package model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matematicas {

    List<Integer> numeros;

    public Matematicas(){
        this.numeros = Arrays.asList(13,1,2,3,3,1,0,2,4,5,6,7,8,4,6,9,0,10,20);
    }

    public int sumar(){
        return numeros.stream()
                .mapToInt(n->n)
                .sum();
    }

    public int sumarConReduce(){
        return numeros.stream()
                .reduce(0,(acumulador, elemento)->acumulador+elemento);
    }

    public double promedio(){
       return numeros.stream()
                .mapToInt(n->n)
                .average()
               .orElse(0);
    }

    public int menorElemento(){
        return numeros.stream()
                .mapToInt(n->n)
                .min()
                .getAsInt();
    }


    public int mayorElemento(){
        return numeros.stream()
                .mapToInt(n->n)
                .max()
                .getAsInt();
    }

    public String separarElementos(){
        return Stream.of("JAVA","C#","PHP","PYTHON","C++")
                .reduce("",(acumulador,lenguaje)->acumulador+lenguaje+"|");
    }

  public List<Integer> ordenarListaAscendente(){
        return numeros.stream()
                .sorted()
                .collect(Collectors.toList());
  }

    public List<Integer> ordenarListaDescendente(){
        return numeros.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

}
