package com.lacemile.model.sys.user;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by yuume on 17/1/7.
 */
@Entity
@Table(name="sys_code_user")
public class User {
    //属性
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int i_key;

    @Size(max = 30)
    @Column(name = "c_user_name", nullable = false)
    private String c_name;

    @Size(max = 100)
    @Column(name = "c_user_image_name", nullable = false)
    private String c_imageName;

    @Size(max = 200)
    @Column(name = "c_user_image_path", nullable = false)
    private String c_imagePath;

    public int getI_key() {
        return i_key;
    }

    public void setI_key(int i_key) {
        this.i_key = i_key;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_imageName() {
        return c_imageName;
    }

    public void setC_imageName(String c_imageName) {
        this.c_imageName = c_imageName;
    }

    public String getC_imagePath() {
        return c_imagePath;
    }

    public void setC_imagePath(String c_imagePath) {
        this.c_imagePath = c_imagePath;
    }

}
