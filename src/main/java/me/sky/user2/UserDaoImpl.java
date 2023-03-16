package me.sky.user2;

import java.util.ArrayList;
import java.util.List;


public class UserDaoImpl implements Dao<User> {
    private List<User> users = new ArrayList<>() {
    };

    public UserDaoImpl() {
        users.add(new User("Alyona"));
        users.add(new User("Artem"));
        users.add(new User("Gherman"));
        users.add(new User("Valery"));
        users.add(new User("Irina"));
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }

}
