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

    /**
     * 构造函数注入
     */
    @Test
    public void fun2(){
        //1.创建容器对象
        ApplicationContext applicationContext = (ApplicationContext) new ClassPathXmlApplicationContext("com/sam/c_injection/applicationContext.xml");
        //2.向容器要User对象
        User user = (User) applicationContext.getBean("user1");
        //3.打印User对象
        System.out.println(user.toString());
    }

    /**
     * P名称空间注入
     */
    @Test
    public void fun3(){
        //1.创建容器对象
        ApplicationContext applicationContext = (ApplicationContext) new ClassPathXmlApplicationContext("com/sam/c_injection/applicationContext.xml");
        //2.向容器要User对象
        User user = (User) applicationContext.getBean("user2");
        //3.打印User对象
        System.out.println(user.toString());
    }

    /**
     * SpEL注入 spring expression language
     */
    @Test
    public void fun4(){
        //1.创建容器对象
        ApplicationContext applicationContext = (ApplicationContext) new ClassPathXmlApplicationContext("com/sam/c_injection/applicationContext.xml");
        //2.向容器要User对象
        User user = (User) applicationContext.getBean("user3");
        //3.打印User对象
        System.out.println(user.toString());
    }

    /**
     * 复杂类型注入
     */
    @Test
    public void fun5(){
        //1.创建容器对象
        ApplicationContext applicationContext = (ApplicationContext) new ClassPathXmlApplicationContext("com/sam/c_injection/applicationContext.xml");
        //2.向容器要User对象
        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");
        //3.打印User对象
        System.out.println(collectionBean.toString());
    }


}
