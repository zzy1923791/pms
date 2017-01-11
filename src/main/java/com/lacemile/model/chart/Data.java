package com.lacemile.model.chart;

/**
 * Created by yuume on 16/12/29.
 */


import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by yuume on 16/12/27.
 * 用户行为分析 雷达图 数据
 */

@Entity
@Table(name="ams_data_chart")
//用户行为分析 雷达图 数据类
public class Data
{
    //属性
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int i_key;

    @Size(max = 12)
    @Column(name = "c_chart_id", nullable = false)
    private String c_chart_id;

    @Size(max = 12)
    @Column(name = "c_chart_indicator_id", nullable = false)
    private String c_chart_indicator_id;

    @Column(name = "f_number", nullable = false)
    private float f_number;

    //标签属性  i_key  的setter、getter方法
    public void setI_key(int i_key) { this.i_key = i_key ; }
    public int getI_key() { return (this.i_key) ; }

    //标签属性  c_chart_id  的setter、getter方法
    public void setC_chart_id(String c_chart_id) { this.c_chart_id = c_chart_id ; }
    public String getC_chart_id() { return (this.c_chart_id) ; }

    //标签属性  c_chart_indicator_id  的setter、getter方法
    public void setC_chart_indicator_id(String c_chart_indicator_id) { this.c_chart_indicator_id = c_chart_indicator_id ; }
    public String getC_chart_indicator_id() { return (this.c_chart_indicator_id) ; }

    //标签属性  f_number  的setter、getter方法
    public void setF_number(float f_number) { this.f_number = f_number ; }
    public float getF_number() { return (this.f_number) ; }

    //重写toString方法
    @Override
    public String toString() {
        return "Indicator [ i_key=" + i_key
                + ", c_chart_id=" + c_chart_id
                + ", c_chart_indicator_id=" + c_chart_indicator_id
                + ", f_number=" + f_number
                + " ]";
    }
}
