package view;

import model.ISuma;

public class Main2 {

    public static void main(String[] args) {
        ISuma suma = (numero1, numero2)-> numero1+numero2;
        System.out.println(suma.sumar(34,16));

        ISuma suma2 = (numero1, numero2)->{
            int resultado = numero1+numero2;
            System.out.println("El resultado de la suma de "+numero1+" y "+numero2+" es: "+resultado);
            return resultado;

        };

        suma2.sumar(24,98);

        System.out.println(suma2.sumar(13,77));

    }
}
