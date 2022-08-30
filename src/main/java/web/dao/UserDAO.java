package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    void createUser(User user);

    User get(int id);

    void update(int id, User updatedUser);

    void delete(int id);
}
