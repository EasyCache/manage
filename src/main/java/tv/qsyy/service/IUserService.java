package tv.qsyy.service;

import tv.qsyy.entity.User;

/**
 * Created by Easy on 2016/6/3.
 */
public interface IUserService {

    public User getUserById(int userId);

    public int login(User user);
}
