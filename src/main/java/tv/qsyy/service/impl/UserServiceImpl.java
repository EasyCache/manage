package tv.qsyy.service.impl;

import org.springframework.stereotype.Service;
import tv.qsyy.dao.UserDao;
import tv.qsyy.entity.User;
import tv.qsyy.service.IUserService;

import javax.annotation.Resource;

/**
 * Created by Easy on 2016/6/3.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private UserDao userDao;

    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    public int login(User user) {
        return userDao.login(user);
    }
}
