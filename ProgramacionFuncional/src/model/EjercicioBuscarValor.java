package model;


import java.util.List;
import java.util.stream.Collectors;

public class EjercicioBuscarValor {

    public boolean edadMenor(List<User> usuarios){
        return (usuarios.stream()
                       .filter(usuario->usuario.getAge()<15)
                       .count())>0;
    }

    public boolean edadMenor2(List<User> usuarios){
        return usuarios.stream().anyMatch(usuario->usuario.getAge()<15);
    }

    public User ObtenerUsuario(List<User> usuarios, int edad){
        return usuarios.stream()
                       .filter(x->x.getAge() == edad)
                       .findFirst()
                       .orElse(new User("Sin nombre", 100));
    }

    public List<Integer> obtenerDistintasEdades(List<User> usuarios){
       return usuarios.stream().map(n -> n.getAge()).distinct().collect(Collectors.toList());

    }
}
