package com.lacemile.chart;

import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by yuume on 17/1/6.
 * 测试 取雷达图的数据与维度
 */
public class ChartRestTest {

    private static final String baseAddress = "http://localhost:8080";

    private static final List<Object> providerList = new ArrayList<Object>();

    @Test
    public void testChartData(){
        String productList = WebClient.create(baseAddress)
                .path("/chart/datas/A001")
                .accept(MediaType.APPLICATION_JSON)
                .get(String.class);

        System.out.println(productList);
    }

    @Test
    public void testChartIndicator(){
        String productList = WebClient.create(baseAddress)
                .path("/chart/indicators/A001")
                .accept(MediaType.APPLICATION_JSON)
                .get(String.class);

        System.out.println(productList);
    }

}
