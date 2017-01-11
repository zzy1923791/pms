package com.lacemile.service.chart;

import com.lacemile.dao.chart.IndicatorDao;
import com.lacemile.model.chart.Indicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yuume on 16/12/27.
 */

@Service("indicatorService")
@Transactional
public class IndicatorServiceImpl implements IndicatorService {

    @Autowired
    private IndicatorDao dao;

    public Indicator findByKey(int i_key){
        return dao.findByKey(i_key);
    }

    public List<Indicator> findById(String c_chart_id) {return dao.findById(c_chart_id); }

    public List<Indicator> findAllIndicator(){
        return dao.findAllIndicator();
    }

}
