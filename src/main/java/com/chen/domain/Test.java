package com.chen.domain;

import com.chen.dao.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @Date: 5:48 下午 2021/2/3
 * @Desc:
 */
public class Test {
    public static void main(String[] args) throws Exception {
        SelectByid();

    }

    public static void SelectByid() throws Exception{
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        //---------------
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.findUserById(1);
        System.out.println(user);
        //--------------
        session.close();

    }

}
