package view;

import model.User;
import java.util.ArrayList;
import java.util.List;

public class MainUser {

    public static void main(String[] args) {

        //Obtener los usuarios con edad mayor a 17 años
        List<User> users = new ArrayList<>();
        users.add(new User("Carolina", 23));
        users.add(new User("Diana", 13));
        users.add(new User("Lorena", 20));
        users.add(new User("Sofia", 15));
        users.add(new User("Andrea", 28));
        users.add(new User("Luisa", 30));
        users.add(new User("Samanta", 17));
        users.add(new User("Adriana", 19));

        //Enfoque Imperativo

        int count = 0;
        for(User user: users){
            if(user.getAge()>=18){
                count++;
            }
        }
        System.out.println("There are "+count+" users");

        //Enfoque Declarativo
        count = (int)users.stream().filter(user->user.getAge()>=18).count();
        System.out.println("There are "+count+" users");
    }


}
