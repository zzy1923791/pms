package com.lacemile.dao.chart;

import com.lacemile.dao.AbstractDao;
import com.lacemile.model.chart.Data;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yuume on 16/12/27.
 */

@Repository("DataDao")
public class DataDaoImpl extends AbstractDao<Integer, Data> implements DataDao {

    public Data findByKey(int i_key) {
        return getByKey(i_key);
    }

    @SuppressWarnings("unchecked")
    public List<Data> findAllData() {
        Criteria criteria = createEntityCriteria();
        return (List<Data>) criteria.list();
    }

    public List<Data> findById(String c_chart_id) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("c_chart_id",c_chart_id));
        return (List<Data>) criteria.list();
    }

}
