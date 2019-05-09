package view;

import model.ISaludar;
import model.ISaludar2;
import model.ISaludar3;


public class Main {



    public static void main(String[] args) {

        ISaludar saludar = ()->System.out.println("Hello World");
        saludar.saluda();

        ISaludar2 saludar2 = usuario->System.out.println("Hello World! "+usuario);
        saludar2.saludar("Jonás");

        ISaludar3 saludar3 = (usuario, saludo)->System.out.println(saludo+usuario);
        saludar3.saludar("Tatiana", "Bienvenida: ");

        ISaludar2 saludar4 = usuario -> {

            if(usuario.equals("Jaime")){
                System.out.println("Hola Jaime");
            }
            else{
                System.out.println("Hola: "+usuario);
            }

        };
        saludar4.saludar("Jaime");
    }
}
