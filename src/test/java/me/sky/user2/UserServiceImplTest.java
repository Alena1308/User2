package me.sky.user2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
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
    private static final User TRUE_USER = users.get(0);
    private static final User FALLS_USER = new User(FALLS_USER_NAME);
    @Mock
    UserDaoImpl mock;
    @InjectMocks
    UserServiceImpl out;

    @BeforeEach
    private void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
    }
    @Test
    void shouldCheckUserExistReturnTrue() {
        when(mock.getUsers()).thenReturn(users);
        Assertions.assertTrue(out.checkUserExist(TRUE_USER));
    }
    @Test
    void shouldCheckUserExistReturnFalls() {
        when(mock.getUsers()).thenReturn(users);
        Assertions.assertFalse(out.checkUserExist(FALLS_USER));
    }
}