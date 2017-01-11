package com.lacemile.dao.sys.user;

import com.lacemile.dao.AbstractDao;
import com.lacemile.model.sys.user.RoleFunctionData;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 * Created by yuume on 17/1/10.
 */
@Repository("RoleFunctionDataDao")
public class RoleFunctionDataDaoImpl extends AbstractDao<Integer, RoleFunctionData> implements RoleFunctionDataDao {
    public int iAuthentication(int i_role_key, int i_function_key) {
        int i_result = 0;
        try {
            Criteria criteria = createEntityCriteria();
            criteria.add(Restrictions.eq("i_userrole_key",i_role_key));
            criteria.add(Restrictions.eq("i_function_key",i_function_key));
            if (criteria.list().size()>0){i_result = 1;}

        }catch (ArithmeticException e){
            i_result = 0;
        }

        return i_result;
    }
}
