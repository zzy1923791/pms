package com.lacemile.service.chart;

import com.lacemile.dao.chart.DataDao;
import com.lacemile.model.chart.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yuume on 16/12/27.
 */

@Service("DataService")
@Transactional
public class DataServiceImpl implements DataService {

    @Autowired
    private DataDao dao;

    public Data findByKey(int i_key){
        return dao.findByKey(i_key);
    }

    public List<Data> findById(String c_chart_id){
        return dao.findById(c_chart_id);
    }

    public List<Data> findAllData(){
        return dao.findAllData();
    }

}
