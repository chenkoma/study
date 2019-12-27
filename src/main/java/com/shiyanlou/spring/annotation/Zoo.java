package com.shiyanlou.spring.annotation;

/**
 * @author koma 16:29 2019-07-09
 * @desc
 */
public class Zoo {
    private Tiger tiger;
    private Monkey monkey;

    public Tiger getTiger() {
        return tiger;
    }

    public void setTiger(Tiger tiger) {
        this.tiger = tiger;
    }

    public Monkey getMonkey() {
        return monkey;
    }

    public void setMonkey(Monkey monkey) {
        this.monkey = monkey;
    }

    public String toString() {
        return tiger + "\n" + monkey;
    }
}
