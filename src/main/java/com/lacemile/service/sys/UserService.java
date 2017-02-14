package com.lacemile.service.sys;

/**
 * Created by yuume on 17/1/20.
 */
import com.lacemile.model.sys.user.User;

import java.util.List;

public interface UserService {
    /**
     * 身份权限认证服务
     * userid
     * systemid
     * serviceid
     * functionid
     * 返回
     * i_accept > 0,为验证通过。
     */

    //获取单个用户信息
    User get_user(int i_key);

    //获取多个用户信息
    List<User> get_userlist(List<Integer> i_keys);

    //
    String jsonGetUsers(String json);
}
