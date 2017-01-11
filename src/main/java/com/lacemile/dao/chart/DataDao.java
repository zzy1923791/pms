package com.lacemile.dao.chart;

import com.lacemile.model.chart.Data;

import java.util.List;

/**
 * Created by yuume on 16/12/27.
 */

// 数据分析接口 雷达图
public interface DataDao {

    Data findByKey(int i_key);
    List<Data> findById(String c_chart_id);
    List<Data> findAllData();

}
