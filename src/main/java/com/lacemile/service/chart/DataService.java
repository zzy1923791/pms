package com.lacemile.service.chart;

import com.lacemile.model.chart.Data;

import java.util.List;

/**
 * Created by yuume on 16/12/27.
 */
public interface DataService {

    Data findByKey(int i_key);

    List<Data> findById(String c_chart_id);

    List<Data> findAllData();

}
