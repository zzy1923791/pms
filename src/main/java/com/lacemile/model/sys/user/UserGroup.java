package com.lacemile.model.sys.user;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by yuume on 17/1/7.
 */
@Entity
@Table(name="sys_code_usergroup")
public class UserGroup {
    //属性
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int i_key;

    @Size(max = 30)
    @Column(name = "c_usergroup_name", nullable = false)
    private String c_usergroup_name;

    public int getI_key() {
        return i_key;
    }

    public void setI_key(int i_key) {
        this.i_key = i_key;
    }

    public String getC_usergroup_name() {
        return c_usergroup_name;
    }

    public void setC_usergroup_name(String c_usergroup_name) {
        this.c_usergroup_name = c_usergroup_name;
    }
}
