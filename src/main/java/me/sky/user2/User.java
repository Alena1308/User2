package me.sky.user2;

import java.util.Objects;

public class User {
    private String name;

    public User(String name) {
        this.name = validateName(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String validateName(String value) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            throw new IllegalArgumentException("Неверно заполненно поле Имя");
        } else {
            return value;
        }
    }
}
