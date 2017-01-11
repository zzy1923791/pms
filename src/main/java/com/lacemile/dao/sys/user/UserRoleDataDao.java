package com.lacemile.dao.sys.user;

import java.util.List;

/**
 * Created by yuume on 17/1/9.
 */
public interface UserRoleDataDao {
    List<Integer> findByUser(int i_user_key);
}
