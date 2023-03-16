package me.sky.user2;

import java.util.List;
import java.util.Optional;

public interface Dao <T>{
    User getUserByName(String name);

    List<T> findAllUsers();

}
