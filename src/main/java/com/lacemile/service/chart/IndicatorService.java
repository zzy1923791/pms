package com.lacemile.service.chart;

import com.lacemile.model.chart.Indicator;

import java.util.List;

/**
 * Created by yuume on 16/12/27.
 */
public interface IndicatorService {

    Indicator findByKey(int i_key);

    List<Indicator> findById(String c_chart_id);

    List<Indicator> findAllIndicator();

}
