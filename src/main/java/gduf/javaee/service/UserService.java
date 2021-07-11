package gduf.javaee.service;

import gduf.javaee.po.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();
    User findUserByUid(String uid);
    List<User> findUserByUsername(String username);
    void addUser(User user);
    void deleteUsers(String[] uidArray);
    void updateUser(User user);
}
