package com.lacemile.controller;

import com.lacemile.model.chart.Data;
import com.lacemile.model.chart.Indicator;
import com.lacemile.service.chart.DataService;
import com.lacemile.service.chart.IndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yuume on 17/1/6.
 * 雷达图Service
 */
@RestController
public class ChartRest {

    @Autowired
    DataService dataService;

    //雷达数据
    @RequestMapping("/chart/datas/{c_chart_id}")
    public List<Data> datas(@PathVariable String c_chart_id){

        //数据
        List<Data> datas = dataService.findById(c_chart_id);
        return datas;
    }

    @Autowired
    IndicatorService indicatorService;

    //雷达维度
    @RequestMapping("/chart/indicators/{c_chart_id}")
    public List<Indicator> indicators(@PathVariable String c_chart_id){

        //维度
        List<Indicator> indicators = indicatorService.findById(c_chart_id);
        return indicators;
    }

}