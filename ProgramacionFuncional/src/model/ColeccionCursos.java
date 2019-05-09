package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ColeccionCursos {

    List<Curso> cursos;

    public ColeccionCursos(){
        this.cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos de Escritura", 1.5f, 10, 300 ));
        cursos.add(new Curso("Cursos de Bases de Datos", 5.5f, 50, 50 ));
        cursos.add(new Curso("Cursos de Automatización", 35.5f, 80, 10 ));
        cursos.add(new Curso("Cursos de Azure", 10.5f, 6, 80 ));
        cursos.add(new Curso("Cursos de Matemáticas", 20.5f, 66, 666 ));
    }

    //Obtener la cantidad de cursos con una duración mayor a 5 horas.
    public List<Curso> obtenerCursosConDuracionMayorA(int duracion){
        return cursos.stream()
                .filter(x->x.getDuracion()>duracion)
                .collect(Collectors.toList());
    }

    //Obtener la cantidad de cursos con una duración menor a 2 horas.
    public List<Curso> obtenerCursosConDuracionMenorA(int duracion){
        return cursos.stream()
                .filter(x->x.getDuracion()<duracion)
                .collect(Collectors.toList());
    }


    //Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.
    public void listarTitulosConVideosMayorA(int cantidadVideos){
         cursos.stream()
                .filter(x->x.getVideos()>cantidadVideos)
                .forEach(x->{
                    System.out.println(x.getTitulo());
                });
    }


    //Mostrar en consola el título de los 3 cursos con mayor duración.
    public void mostrarLosNTitulosConMayorDuracion(int limite){
        Comparator<Curso> comparator = Comparator.comparing(curso->curso.getDuracion());
        cursos.stream()
                .sorted(comparator.reversed())
                .limit(limite)
                .forEach(x->{
                    System.out.println(x.getTitulo());
                });
    }


    //Mostrar en consola la duración total de todos los cursos.
    public void mostrarDuracionTotal(){
        System.out.println(cursos.stream()
                .mapToDouble(x -> x.getDuracion())
                .sum());

    }


    //Mostrar en consola todos aquellos libros que superen el promedio
    //en cuanto a duración se refiere.
    public void mostrarCursosQueSuperanPromedioDuracion(){
        double average = cursos.stream()
                .mapToDouble(duracion -> duracion.getDuracion())
                .average()
                .orElse(0);

        cursos.stream()
                .filter(curso -> curso.getDuracion()>average)
                .forEach(curso->System.out.println(curso));
    }


    //Mostrar en consola la duración de todos aquellos cursos que tengan
    //una cantidad de alumnos inscritos menor a 500.
    public void mostrarDuracionTodosLosCursosConAlumnosN(int n){
       double sum = cursos.stream()
                .filter(curso -> curso.getAlumnos()<n)
                .mapToDouble(curso->curso.getDuracion()).sum();
        System.out.println(sum);
    }

    //Mostrar en consola la duración de todos aquellos cursos que tengan
    //una cantidad de alumnos inscritos menor a 500.
    public void mostrarDuracionCursosConAlumnosN(int n){
        cursos.stream()
                .filter(curso->curso.getAlumnos()<500)
                .forEach(curso-> System.out.println(curso.getDuracion()));
    }


    //Obtener el curso con mayor duración.
    public void obtenerCursoConMayorDuracion(){
        double mayorDuracion = cursos.stream()
                .mapToDouble(curso->curso.getDuracion())
                .max().orElse(0);

        cursos.stream()
                .filter(curso->curso.getDuracion() == Float.parseFloat(mayorDuracion+""))
                .forEach(curso-> System.out.println(curso));
    }


    //Crear una lista de Strings con todos los titulos de los cursos.
    public List<String> concatenarTitulosDeLosCursos(){
        return cursos.stream()
                .map(x->x.getTitulo())
                .collect(Collectors.toList());
    }
}
