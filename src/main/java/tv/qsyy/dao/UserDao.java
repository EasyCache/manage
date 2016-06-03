package tv.qsyy.dao;

import tv.qsyy.entity.User;

/**
 * Created by Easy on 2016/6/2.
 */

public interface UserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int login(User user);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
