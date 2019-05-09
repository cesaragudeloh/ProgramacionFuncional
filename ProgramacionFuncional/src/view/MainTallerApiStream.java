package view;

import model.ColeccionCursos;

public class MainTallerApiStream {

    public static void main(String[] args) {
        ColeccionCursos cc = new ColeccionCursos();
        System.out.println("Cursos con duración mayor a 20: ");
        System.out.println(cc.obtenerCursosConDuracionMayorA(20));
        System.out.println("\nCursos con duración menor a 2: ");
        System.out.println(cc.obtenerCursosConDuracionMenorA(2));
        System.out.println("\nCursos con cantidad de videos mayor a 50: ");
        cc.listarTitulosConVideosMayorA(50);
        System.out.println("\n3 títulos con mayor duración: ");
        cc.mostrarLosNTitulosConMayorDuracion(3);
        System.out.println("\nLa duración total de los cursos es: ");
        cc.mostrarDuracionTotal();
        System.out.println("\nLos cursos que superan el promedio de la duración son: ");
        cc.mostrarCursosQueSuperanPromedioDuracion();
        System.out.println("\nLa duracion total de los cursos que tienen menos de 500 alumnos es: ");
        cc.mostrarDuracionTodosLosCursosConAlumnosN(500);
        System.out.println("\nLa duracion de los cursos que tienen menos de 500 alumnos es: ");
        cc.mostrarDuracionCursosConAlumnosN(500);
        System.out.println("\nEl curso con la mayor duración es:");
        cc.obtenerCursoConMayorDuracion();
        System.out.println("\nLista de títulos: ");
        System.out.println(cc.concatenarTitulosDeLosCursos());
    }
}
