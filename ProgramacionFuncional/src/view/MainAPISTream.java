package view;

import model.APIStream;
import model.EjercicioBuscarValor;
import model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainAPISTream {


    public static void main(String[] args) {
        List<User> users = before();
        APIStream apiStream = new APIStream();

        System.out.println("Count total: "+apiStream.countList(users));

        System.out.println("Users age greather than 23: "+
                apiStream.countUsersGreaterThan(users, 23));

        System.out.println("Users that start with L : "+apiStream.userThatStartWith(users,"L"));

        System.out.println(apiStream.userThatStartWith2(users, "L"));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(apiStream.squareOfAList(list));

        EjercicioBuscarValor buscarValor = new EjercicioBuscarValor();
        System.out.println("Método 1: "+buscarValor.edadMenor(users));
        System.out.println("AnyMatch: "+buscarValor.edadMenor2(users));

        System.out.println(buscarValor.ObtenerUsuario(users, 100));

        System.out.println("Edades distintas: \n"+buscarValor.obtenerDistintasEdades(users));
    }


    public static List<User> before(){
        List<User> users = new ArrayList<>();
        users.add(new User("Carolina", 23));
        users.add(new User("Diana", 33));
        users.add(new User("Lorena", 20));
        users.add(new User("Sofia", 15));
        users.add(new User("Sofia", 15));
        users.add(new User("Sofia", 15));
        users.add(new User("Sofia", 15));
        users.add(new User("Camila", 99));
        users.add(new User("Sofia", 15));
        users.add(new User("Sofia", 15));
        users.add(new User("Sofia", 15));
        users.add(new User("Sofia", 15));
        users.add(new User("Andrea", 28));
        users.add(new User("Luisa", 30));
        users.add(new User("Samanta", 17));
        users.add(new User("Adriana", 19));
        return users;
    }
}
