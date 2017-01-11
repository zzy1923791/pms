package com.lacemile.model.chart;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by yuume on 16/12/27.
 * 用户行为分析 雷达图
 */

@Entity
@Table(name="ams_code_chart_indicator")
//用户行为分析 雷达图 设置类
public class Indicator
{
    //属性
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int i_key;

    @Size(max = 12)
    @Column(name = "c_chart_id", nullable = false)
    private String c_chart_id;

    @Size(max = 20)
    @Column(name = "c_chart_name", nullable = false)
    private String c_chart_name;

    @Size(max = 12)
    @Column(name = "c_chart_indicator_id", nullable = false)
    private String c_chart_indicator_id;

    @Size(max = 20)
    @Column(name = "c_chart_indicator_name", nullable = false)
    private String c_chart_indicator_name;

    @Column(name = "i_maximum", nullable = false)
    private int i_maximum;

    //标签属性  i_key  的setter、getter方法
    public void setI_key(int i_key) { this.i_key = i_key ; }
    public int getI_key() { return (this.i_key) ; }

    //标签属性  c_chart_id  的setter、getter方法
    public void setC_chart_id(String c_chart_id) { this.c_chart_id = c_chart_id ; }
    public String getC_chart_id() { return (this.c_chart_id) ; }

    //标签属性  c_chart_name  的setter、getter方法
    public void setC_chart_name(String c_chart_name) { this.c_chart_name = c_chart_name ; }
    public String getC_chart_name() { return (this.c_chart_name) ; }

    //标签属性  c_chart_indicator_id  的setter、getter方法
    public void setC_chart_indicator_id(String c_chart_indicator_id) { this.c_chart_indicator_id = c_chart_indicator_id ; }
    public String getC_chart_indicator_id() { return (this.c_chart_indicator_id) ; }

    //标签属性  c_chart_indicator_name  的setter、getter方法
    public void setC_chart_indicator_name(String c_chart_indicator_name) { this.c_chart_indicator_name = c_chart_indicator_name ; }
    public String getC_chart_indicator_name() { return (this.c_chart_indicator_name) ; }

    //标签属性  i_maximum  的setter、getter方法
    public void setI_maximum(int i_maximum) { this.i_maximum = i_maximum ; }
    public int getI_maximum() { return (this.i_maximum) ; }

    //重写toString方法
    @Override
    public String toString() {
        return "Indicator [ i_key=" + i_key
                + ", c_chart_id=" + c_chart_id
                + ", c_chart_name=" + c_chart_name
                + ", c_chart_indicator_id=" + c_chart_indicator_id
                + ", c_chart_indicator_name=" + c_chart_indicator_name
                + ", i_maximum=" + i_maximum
                + " ]";
    }
}
