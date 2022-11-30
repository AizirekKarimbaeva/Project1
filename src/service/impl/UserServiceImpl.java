package service.impl;

import dao.MyException;
import dao.UserDao;
import model.User;
import service.UserServiceAble;
import java.util.List;

public class UserServiceImpl implements UserServiceAble  {
    UserDao userDao = new UserDao();
    @Override
    public void addUser(User users) {
        userDao.getUsers().add(users);
    }
    @Override
    public User findById(int id) throws MyException {
       User user =  userDao.getUsers()
               .stream()
               .filter(m->m.getId()==id).findFirst()
               .orElseThrow(()->new MyException("Not found with id: "+id));
        return user;
    }
    @Override
    public String deleteById(int id) {
        User user =userDao.getUsers().stream()
                .filter(n->n.getId()==id).findFirst().get();
        userDao.getUsers().remove(user);
        return "Successfully deleted with id: "+id;
    }
    @Override
    public List<User> getAllUsers() {
       return userDao.getUsers();
    }
}

