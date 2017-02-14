package com.lacemile.dao.sys.user;

import com.lacemile.dao.AbstractDao;
import com.lacemile.model.sys.user.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuume on 17/1/20.
 */
@Repository("UserDao")
public class UserDaoImpl  extends AbstractDao<Integer, User> implements UserDao {
    public User findByKey(int i_user_key) {
        User user = new User();
        try {
            Criteria criteria = createEntityCriteria();
            criteria.add(Restrictions.eq("i_key",i_user_key));
            if (criteria.list().size()>0){
                user = (User)criteria.list().get(0);
            }

        }catch (ArithmeticException e){
            user = null;
        }

        return user;
    }

    public List<User> findByKeys(List<Integer> i_keys) {
        List<User> users = new ArrayList<User>();
        for (Integer i:i_keys
             ) {
            users.add(findByKey(i.intValue()));
        }
        return users;
    }

}
