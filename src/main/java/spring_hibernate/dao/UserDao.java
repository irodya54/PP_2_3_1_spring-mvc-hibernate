package spring_hibernate.dao;


import spring_hibernate.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    List<User> getAllUsers();
    User getUserById(int id);
}