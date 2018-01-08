package com.sam.c_injection;

import com.sam.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring 4种方式注入
 *
 * @Author: SamZhao
 * @Description:
 * @Date: 2018/01/08 15:17
 */
public class TestSpring {

    /**
     * set 方式注入
     */
    @Test
    public void fun1(){
        //1.创建容器对象
        ApplicationContext applicationContext = (ApplicationContext) new ClassPathXmlApplicationContext("com/sam/c_injection/applicationContext.xml");
        //2.向容器要User对象
        User user = (User) applicationContext.getBean("user");
        //3.打印User对象
        System.out.println(user.toString());
    }

}
