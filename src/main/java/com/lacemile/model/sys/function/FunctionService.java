package com.lacemile.model.sys.function;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by yuume on 17/1/7.
 */
@Entity
@Table(name="sys_code_function")
public class FunctionService {
    //属性
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int i_key;

    @Size(max = 30)
    @Column(name = "c_service_name", nullable = false)
    private String c_service_name;

    @Column(name = "i_system_key", nullable = false)
    private int i_system_key;

    public int getI_key() {
        return i_key;
    }

    public void setI_key(int i_key) {
        this.i_key = i_key;
    }

    public String getC_service_name() {
        return c_service_name;
    }

    public void setC_service_name(String c_service_name) {
        this.c_service_name = c_service_name;
    }

    public int getI_system_key() {
        return i_system_key;
    }

    public void setI_system_key(int i_system_key) {
        this.i_system_key = i_system_key;
    }
}
