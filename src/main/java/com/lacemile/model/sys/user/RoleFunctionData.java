package com.lacemile.model.sys.user;

import javax.persistence.*;

/**
 * Created by yuume on 17/1/10.
 */
@Entity
@Table(name="sys_data_userrole_function")
public class RoleFunctionData {
    //属性
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int i_key;

    @Column(name = "i_userrole_key", nullable = false)
    private int i_userrole_key;

    @Column(name = "i_function_key", nullable = false)
    private int i_function_key;

    public int getI_key() {
        return i_key;
    }

    public void setI_key(int i_key) {
        this.i_key = i_key;
    }

    public int getI_userrole_key() {
        return i_userrole_key;
    }

    public void setI_userrole_key(int i_userrole_key) {
        this.i_userrole_key = i_userrole_key;
    }

    public int getI_function_key() {
        return i_function_key;
    }

    public void setI_function_key(int i_function_key) {
        this.i_function_key = i_function_key;
    }
}
