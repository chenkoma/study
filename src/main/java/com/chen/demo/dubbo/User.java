package com.chen.demo.dubbo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author koma 10:57 2020-01-10
 * @desc
 */

@Getter
@Setter
public class User implements Serializable {
    private static final long serialVersionUID = -6878053406541100993L;

    private String name;
    private int age;
    private String sex;

}
