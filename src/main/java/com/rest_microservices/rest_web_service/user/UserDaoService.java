package com.rest_microservices.rest_web_service.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static Integer userCount = 0;
    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User(++userCount,"Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++userCount,"Eve", LocalDate.now().minusYears(25)));
        users.add(new User(++userCount,"Jim", LocalDate.now().minusYears(20)));

    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(int id){
        // you can also pass predicate to filter
//        Predicate<? super User> predicate = user -> user.getId().equals(id);
      return   users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public User save(User user){
        user.setId(++userCount);
        users.add(user);
        return user;
    }
    public void deleteById(int id){
        // you can also pass predicate to filter
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);

    }

}
