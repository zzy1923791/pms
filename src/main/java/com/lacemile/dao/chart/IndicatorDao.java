package com.lacemile.dao.chart;

import com.lacemile.model.chart.Indicator;

import java.util.List;

/**
 * Created by yuume on 16/12/27.
 */

// 数据分析接口 雷达图
public interface IndicatorDao {

    Indicator findByKey(int i_key);
    List<Indicator> findById(String c_chart_id);
    List<Indicator> findAllIndicator();

}
