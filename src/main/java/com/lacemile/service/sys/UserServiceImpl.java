package com.lacemile.service.sys;

import com.lacemile.dao.sys.user.UserDao;
import com.lacemile.model.sys.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yuume on 17/1/20.
 */
@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User get_user(int i_key) {
        return userDao.findByKey(i_key);
    }

    public List<User> get_userlist(List<Integer> i_keys) {
        return userDao.findByKeys(i_keys);
    }

    public String jsonGetUsers(String json) {

//        List<Integer> iKeys = new ArrayList<Integer>();
//        iKeys.add(1);
//        iKeys.add(3);
//        iKeys.add(5);
//        iKeys.add(11);
//
//        List<User> users = userDao.findByKeys(iKeys);
//
//        //转换成输出 Json
//        ObjectMapper mapper = new ObjectMapper();
//        String srtJson = mapper.writeValueAsString(users);

        return null;
    }

}
