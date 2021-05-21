package com.alibaba.dubbo.demo;

import java.util.List;

/**
 * @Date: 5:25 下午 2021/5/10
 * @Desc:
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}
