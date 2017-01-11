package com.lacemile.dao.sys.user;

import com.lacemile.dao.AbstractDao;
import com.lacemile.model.sys.user.UserRoleData;
import org.hibernate.Criteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuume on 17/1/9.
 */
@Repository("UserRoleDataDao")
public class UserRoleDataDaoImpl extends AbstractDao<Integer, UserRoleData> implements UserRoleDataDao {
    public List<Integer> findByUser(int i_user_key) {
        List<Integer> ls_result = new ArrayList<Integer>();
        try {
            Criteria criteria = createEntityCriteria();
            ProjectionList proList = Projections.projectionList();//设置投影集合
            proList.add(Projections.groupProperty( "i_userrole_key"));
            criteria.setProjection(proList);
            criteria.add(Restrictions.eq("i_user_key",i_user_key));

            ls_result = (List<Integer>) criteria.list();

        }catch (ArithmeticException e){
            ls_result.clear();
            ls_result.add(0);
        }

        return ls_result;
    }
}
