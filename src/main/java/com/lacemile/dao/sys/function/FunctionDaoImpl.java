package com.lacemile.dao.sys.function;

import com.lacemile.dao.AbstractDao;
import com.lacemile.model.sys.function.Function;
import org.hibernate.Criteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuume on 17/1/7.
 */
@Repository("FunctionDao")
public class FunctionDaoImpl extends AbstractDao<Integer, Function> implements FunctionDao {
    public int iFunctionKey(String uri) {
        List<Integer> i_results = new ArrayList<Integer>();
        int i_result = 0;

        try {
            Criteria criteria = createEntityCriteria();
            ProjectionList proList = Projections.projectionList();//设置投影集合
            proList.add(Projections.groupProperty( "i_key"));
            criteria.setProjection(proList);
            criteria.add(Restrictions.eq("c_function_uri",uri));

            i_results = (List<Integer>)criteria.list();

        }catch (ArithmeticException e){
            i_results.clear();
            i_results.add(0);
        }

        if (i_results.size()==0){
            i_result = 0;
        }else {
            i_result = i_results.get(0).intValue();
        }

        return i_result;
    }
}
