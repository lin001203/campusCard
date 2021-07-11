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

    @Override
    public List<User> findAllUser() {
        return null;
    }

    @Override
    public User findUserByUid(String uid) {
        return null;
    }

    @Override
    public List<User> findUserByUsername(String username) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void deleteUsers(String[] uidArray) {

    }

    @Override
    public void updateUser(User user) {

    }
}
