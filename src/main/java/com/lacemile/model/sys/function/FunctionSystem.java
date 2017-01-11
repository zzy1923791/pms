package com.lacemile.model.sys.function;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by yuume on 17/1/7.
 */
@Entity
@Table(name="sys_code_functionsystem")
public class FunctionSystem {
    //属性
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int i_key;

    @Size(max = 30)
    @Column(name = "c_system_name", nullable = false)
    private String c_system_name;

    public int getI_key() {
        return i_key;
    }

    public void setI_key(int i_key) {
        this.i_key = i_key;
    }

    public String getC_system_name() {
        return c_system_name;
    }

    public void setC_system_name(String c_system_name) {
        this.c_system_name = c_system_name;
    }
}
