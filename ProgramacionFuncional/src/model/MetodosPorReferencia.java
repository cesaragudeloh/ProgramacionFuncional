package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MetodosPorReferencia {

    List<Integer> lista;

    public MetodosPorReferencia(){
        this.lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    }

    /*
    Referencia a métodos estáticos
    Al hacer su llamado, lo hacemos NOMBRE_CLASE::NOMBRE_METODO
     */

    public List<Integer> obtenerCubos(){
        return lista.stream()
                .map(MetodosPorReferencia::obtenerCubo)
                .collect(Collectors.toList());
    }

    public static int obtenerCubo(int numero)  {
        return numero*numero*numero;
    }


    public int obtenerCubo2(int numero)  {
        return numero*numero*numero;
    }

    //Método de Instancia de un objeto arbitrario
    public void imprimirTitulos(){
        List<Curso> cursos = this.llenarListaCursos();
        cursos.stream()
                .map(Curso::getTitulo)
                .forEach(System.out::println);
    }

    /*
    Constructor por referencia
    Se crea una interfaz, en la cual su método abstracto será del tipo de la clase que
    vamos a instanciar (con los mismos parámetros)
     */
    public List<User> CrearUsers(){
        List<User> listaUsuarios = new ArrayList<>();
        IUser iUser =User::new;

        User user1 = iUser.create("Juan", 23);
        User user2 = iUser.create("David", 13);
        User user3 = iUser.create("Tatiana", 35);
        User user4 = iUser.create("Luisa", 17);
        User user5 = iUser.create("Roberto", 87);

        listaUsuarios.add(user1);
        listaUsuarios.add(user2);
        listaUsuarios.add(user3);
        listaUsuarios.add(user4);
        listaUsuarios.add(user5);

        return listaUsuarios;
    }


    public void imprimirListaUsuarios(){
        List<User> listaUsuarios = CrearUsers();
        listaUsuarios.stream()
                .map(User::getName)
                .forEach(System.out::println);
    }


    public List<Curso> llenarListaCursos(){
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos de Escritura", 1.5f, 10, 300 ));
        cursos.add(new Curso("Cursos de Bases de Datos", 5.5f, 50, 50 ));
        cursos.add(new Curso("Cursos de Automatización", 35.5f, 80, 10 ));
        cursos.add(new Curso("Cursos de Azure", 10.5f, 6, 80 ));
        cursos.add(new Curso("Cursos de Matemáticas", 20.5f, 66, 666 ));
        return cursos;
    }
}
