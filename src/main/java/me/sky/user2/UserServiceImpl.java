package me.sky.user2;

public class UserServiceImpl implements UserService {
    private UserDaoImpl userDao;

    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(User user) {
        if(userDao.getUsers().contains(user)){
            return true;
        } else{
            return false;
        }
    }
}
