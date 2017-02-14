package com.lacemile.dao.sys.user;

import com.lacemile.model.sys.user.User;

import java.util.List;

/**
 * Created by yuume on 17/1/9.
 * 用户信息Dao
 */


public interface UserDao {
    User findByKey(int i_user_key);
    List<User> findByKeys(List<Integer> i_keys);

}
