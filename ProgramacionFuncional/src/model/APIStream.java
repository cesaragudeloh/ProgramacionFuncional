package model;

import model.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class APIStream {

    public long countList(List<User> users){
        return users.stream().count();
    }

    public long countUsersGreaterThan(List<User> users, int age){
        return users.stream()
                .filter(user->user.getAge()>age)
                .count();
    }

    public long userThatStartWith(List<User> users, String letter){
        return users.stream()
                .filter(user->user.getName().startsWith(letter)).count();
    }

    public List<User> userThatStartWith2(List<User> users, String letter){
        return users.stream()
                        .filter(user->user.getName()
                        .startsWith(letter))
                        .collect(Collectors.toList());

    }

public List<Integer> squareOfAList(List<Integer> numbers){
        return numbers.stream()
                .map(number->number*number)
                .collect(Collectors.toList());
}

}
