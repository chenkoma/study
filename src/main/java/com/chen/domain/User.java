package com.chen.domain;

/**
 * @Date: 5:40 下午 2021/2/3
 * @Desc:
 */
public class User {
    private Integer user_id;
    private String user_name;
    private String user_sex;
    private String user_phone;

    public String toString() {
        return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_sex=" + user_sex + ", user_phone="
                + user_phone + "]";
    }

}
