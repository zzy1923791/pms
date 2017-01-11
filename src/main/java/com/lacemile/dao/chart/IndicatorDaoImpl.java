package com.lacemile.dao.chart;

import com.lacemile.dao.AbstractDao;
import com.lacemile.model.chart.Indicator;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yuume on 16/12/27.
 */

@Repository("IndicatorDao")
public class IndicatorDaoImpl extends AbstractDao<Integer, Indicator> implements IndicatorDao {

    public Indicator findByKey(int i_key) {
        return getByKey(i_key);
    }

    @SuppressWarnings("unchecked")
    public List<Indicator> findAllIndicator() {
        Criteria criteria = createEntityCriteria();
        return (List<Indicator>) criteria.list();
    }

    public List<Indicator> findById(String c_chart_id) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("c_chart_id",c_chart_id));
        return (List<Indicator>) criteria.list();
    }

}
