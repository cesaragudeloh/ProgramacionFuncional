package model;

public class Libro {

    String nombre;
    int copiasVendidas;

    public Libro(String nombre, int copiasVendidas) {
        this.nombre = nombre;
        this.copiasVendidas = copiasVendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCopiasVendidas() {
        return copiasVendidas;
    }

    public void setCopiasVendidas(int copiasVendidas) {
        this.copiasVendidas = copiasVendidas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", copiasVendidas=" + copiasVendidas +
                '}';
    }
}
