package com.lacemile.service.sys;

import com.lacemile.dao.sys.function.FunctionDao;
import com.lacemile.dao.sys.user.RoleFunctionDataDao;
import com.lacemile.dao.sys.user.UserRoleDataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuume on 17/1/9.
 */
@Service("AuthenticationService")
@Transactional
public class AuthenticationServiceImpl implements AuthenticationService {

    public int i_accept(int userid, int systemid, int serviceid, int functionid) {
        //获取用户权限集合

        //权限验证结果

        //默认权限验证结果:0

        //验证通过:1

        //验证失败:-1

        return 0;
    }

    public int i_accept(int userid, String uri) {

        //默认权限验证结果:0
        int i_result = 0;

        //获取用户角色集合
        List<Integer> roles;
        try {
            roles = getRoles(userid);
        } catch (ArithmeticException e){
            //用户角色列表不存在
            return -3;
        }

        //获取uri的key
        int i_function_key;
        try {
            i_function_key = getUriKey(uri);
            if(i_function_key == 0){
                //URI不存在
                return -2;
            }
        } catch (ArithmeticException e){
            //URI不存在
            return -2;
        }

        //权限验证结果
        //验证通过:1
        try {
            i_result = iAuthentication(roles,i_function_key);
        } catch (ArithmeticException e) {
            //验证失败:-1
            i_result = -1;
        }

        return i_result;
    }

    @Autowired
    private RoleFunctionDataDao roleFunctionDataDao;

    //验证
    private int iAuthentication(List<Integer> roles, int i_function_key){
        int i_result = 0;
        for (Integer i:roles
             ) {
            if (roleFunctionDataDao.iAuthentication(i.intValue(),i_function_key) == 1){
                i_result = 1;
                break;
            }
        }
        return i_result;
    }

    @Autowired
    private UserRoleDataDao userRoleDataDao;

    //获取用户角色集合
    private List<Integer> getRoles(int i_user_key){
        List<Integer> i_userrole_keys = new ArrayList<Integer>();
        //获取用户 角色列表
        try {
            i_userrole_keys = userRoleDataDao.findByUser(i_user_key);
        }catch (ArithmeticException e){
            i_userrole_keys.clear();
            i_userrole_keys.add(0);
        }

        return i_userrole_keys;
    }

    @Autowired
    private FunctionDao functionDao;
    //获取URI的key
    private int getUriKey(String c_function_uri){
        int i_result;
        try {
            i_result = functionDao.iFunctionKey(c_function_uri);
        }catch (ArithmeticException e){
            i_result = 0;
        }

        return i_result;
    }
}
