package gduf.javaee.mapper;

import gduf.javaee.po.User;

import java.util.List;

public interface UserMapper {
    User selectUserByUid(String uid);
    List<User> selectUserByUsername(String username);
    List<User> selectUsers();
    void insertUser(User user);
    void updateUser(User user);
    void deleteUserByUid(String uid);
}
