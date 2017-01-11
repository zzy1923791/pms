package com.lacemile.service.sys;

/**
 * Created by yuume on 17/1/9.
 */
public interface AuthenticationService {
    /**
     * 身份权限认证服务
     * userid
     * systemid
     * serviceid
     * functionid
     * 返回
     * i_accept > 0,为验证通过。
     */

    //通过权限树验证
    int i_accept(int userid, int systemid, int serviceid, int functionid);

    //通过uri验证
    int i_accept(int userid, String uri);

}
