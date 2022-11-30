package service;

import model.User;
import java.util.List;
public interface UserServiceAble {
    void addUser(User users);
    User findById(int id);
    String deleteById(int id);
    List<User> getAllUsers();
}
