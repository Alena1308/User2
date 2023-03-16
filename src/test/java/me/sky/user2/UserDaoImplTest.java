package me.sky.user2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class UserDaoImplTest {
    private static final String TRUE_USER_NAME1 = "Alyona";
    private static final String TRUE_USER_NAME2 = "Artem";
    private static final String TRUE_USER_NAME3 = "Gherman";
    private static final String TRUE_USER_NAME4 = "Valery";
    private static final String TRUE_USER_NAME5 = "Irina";
    private static final String FALLS_USER_NAME = "Steev";
    private static final List<User> users = new ArrayList(Arrays.asList(
            new User(TRUE_USER_NAME1),
            new User(TRUE_USER_NAME2), new User(TRUE_USER_NAME3),
            new User(TRUE_USER_NAME4), new User(TRUE_USER_NAME5)));
    UserDaoImpl userDao;
    @BeforeEach
    private void createNewUser(){
        userDao = new UserDaoImpl();
    }

    @Test
    void shouldGetUserByName() {
        Assertions.assertEquals(new User(TRUE_USER_NAME1), userDao.getUserByName(TRUE_USER_NAME1));
    }
    @Test
    void shouldReturnNullGetUserByName() {
        Assertions.assertNull(userDao.getUserByName(FALLS_USER_NAME));
    }
    @Test
    void shouldFindAllUsers(){
        Assertions.assertEquals(users, userDao.findAllUsers());
    }
}