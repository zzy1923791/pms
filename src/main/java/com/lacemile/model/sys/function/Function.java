package com.lacemile.model.sys.function;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by yuume on 17/1/7.
 */
@Entity
@Table(name="sys_code_function")
public class Function {
    //属性
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int i_key;

    @Size(max = 30)
    @Column(name = "c_function_name", nullable = false)
    private String c_function_name;

    @Size(max = 300)
    @Column(name = "c_function_uri", nullable = false)
    private String c_function_uri;

    @Column(name = "i_enable", nullable = false)
    private int i_enable;

    @Column(name = "i_service_key", nullable = false)
    private int i_service_key;

    public int getI_key() {
        return i_key;
    }

    public void setI_key(int i_key) {
        this.i_key = i_key;
    }

    public String getC_function_name() {
        return c_function_name;
    }

    public void setC_function_name(String c_function_name) {
        this.c_function_name = c_function_name;
    }

    public String getC_function_uri() {
        return c_function_uri;
    }

    public void setC_function_uri(String c_function_uri) {
        this.c_function_uri = c_function_uri;
    }

    public int getI_enable() {
        return i_enable;
    }

    public void setI_enable(int i_enable) {
        this.i_enable = i_enable;
    }

    public int getI_service_key() {
        return i_service_key;
    }

    public void setI_service_key(int i_service_key) {
        this.i_service_key = i_service_key;
    }
}
