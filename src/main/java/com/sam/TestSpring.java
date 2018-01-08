package com.sam;

import com.sam.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: SamZhao
 * @Description:
 * @Date: 2018/01/08 15:17
 */
public class TestSpring {

    @Test
    public void testUser(){
        //1.创建容器对象
        ApplicationContext appletContext = (ApplicationContext) new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.向容器要User对象
        User user = (User) appletContext.getBean("user");
        User user1 = (User) appletContext.getBean("user");
        user.setName("sam");
        user.setAge(27);
        //3.打印User对象
        System.out.println(user.toString());

    }

}
