package com.lacemile.model.sys.user;

import javax.persistence.*;

@Entity
@Table(name="sys_data_user_userrole")
public class UserRoleData {
    //属性
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int i_key;

    @Column(name = "i_user_key", nullable = false)
    private int i_user_key;

    @Column(name = "i_userrole_key", nullable = false)
    private int i_userrole_key;

    public int getI_key() {
        return i_key;
    }

    public void setI_key(int i_key) {
        this.i_key = i_key;
    }

    public int getI_user_key() {
        return i_user_key;
    }

    public void setI_user_key(int i_user_key) {
        this.i_user_key = i_user_key;
    }

    public int getI_userrole_key() {
        return i_userrole_key;
    }

    public void setI_userrole_key(int i_userrole_key) {
        this.i_userrole_key = i_userrole_key;
    }
}
