package view;

import model.Ordenamiento;

public class MainOrdenamiento {

    public static void main(String[] args) {
        Ordenamiento ordenamiento = new Ordenamiento();
        //System.out.println(ordenamiento.ordenarAscendentePorCopias());
        //System.out.println(ordenamiento.ordenarDescendentePorCopias());
        System.out.println(ordenamiento.mostrarNLibrosMasVendidos(2));
    }
}
