package gduf.javaee.service.impl;

import gduf.javaee.mapper.UserMapper;
import gduf.javaee.po.User;
import gduf.javaee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAllUser() {
        return userMapper.selectUsers();
    }

    public User findUserByUid(String uid) {
        return userMapper.selectUserByUid(uid);
    }

    public List<User> findUserByUsername(String username) {
        return userMapper.selectUserByUsername(username);
    }

    public void addUser(User user) {
        userMapper.insertUser(user);
    }

    public void deleteUsers(String[] uidArray) {
        for(int i=0;i<uidArray.length;i++)
            userMapper.deleteUserByUid(uidArray[i]);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}
