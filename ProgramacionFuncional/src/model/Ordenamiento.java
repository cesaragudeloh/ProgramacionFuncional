package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ordenamiento {

    List<Libro> libros;

    public Ordenamiento(){
        this.libros = new ArrayList<>();
        libros.add(new Libro("El señor de los anillos",150));
        libros.add(new Libro("Don quijote de la mancha",500));
        libros.add(new Libro("La iliada",200));
        libros.add(new Libro("El Hobbit",100));
        libros.add(new Libro("El Principito",140));
    }

    public List<Libro> ordenarAscendentePorCopias(){
        Comparator<Libro> comparatorCopias = Comparator.comparing(book->book.getCopiasVendidas());
        return libros.stream()
                .sorted(comparatorCopias)
                .collect(Collectors.toList());
    }

    public List<Libro> ordenarDescendentePorCopias(){
        Comparator<Libro> comparatorCopias = Comparator.comparing(book->book.getCopiasVendidas());
        return libros.stream()
                .sorted(comparatorCopias.reversed())
                .collect(Collectors.toList());
    }

    public List<Libro> mostrarNLibrosMasVendidos(int n){
        Comparator<Libro> comparatorCopias = Comparator.comparing(book->book.getCopiasVendidas());
        return libros.stream()
                .sorted(comparatorCopias.reversed())
                .limit(n)
                .collect(Collectors.toList());
    }
}

