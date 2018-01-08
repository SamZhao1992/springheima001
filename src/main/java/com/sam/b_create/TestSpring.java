package com.sam.b_create;

import com.sam.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring 创建对象方式
 *
 * @Author: SamZhao
 * @Description:
 * @Date: 2018/01/08 15:17
 */
public class TestSpring {

    /**
     * 创建方式1 空参构造
     */
    @Test
    public void fun1(){
        //1.创建容器对象
        ApplicationContext applicationContext = (ApplicationContext) new ClassPathXmlApplicationContext("com/sam/b_create/applicationContext.xml");
        //2.向容器要User对象
        User user = (User) applicationContext.getBean("user");
        user.setName("sam");
        user.setAge(27);
        //3.打印User对象
        System.out.println(user.toString());
    }

    /**
     * 静态工厂方式
     */
    @Test
    public void fun2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/sam/b_create/applicationContext.xml");
        //2.向容器要User对象
        User user = (User) applicationContext.getBean("userFactory");
        user.setName("sam");
        user.setAge(27);
        //3.打印User对象
        System.out.println(user.toString());
    }

    /**
     * 动态工厂（实例工厂）
     */
    @Test
    public void fun3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/sam/b_create/applicationContext.xml");
        //2.向容器要User对象
        User user = (User) applicationContext.getBean("user1");
        user.setName("sam");
        user.setAge(27);
        //3.打印User对象
        System.out.println(user.toString());
    }

    /**
     * 单例
     * scope    singleton
     */
    @Test
    public void fun4(){
        //1.创建容器对象
        ApplicationContext applicationContext = (ApplicationContext) new ClassPathXmlApplicationContext("com/sam/b_create/applicationContext.xml");
        //2.向容器要User对象
        User user = (User) applicationContext.getBean("user");
        User user1 = (User) applicationContext.getBean("user");
        User user2 = (User) applicationContext.getBean("user");

        //3.打印User对象
        System.out.println(user == user1);
    }

    /**
     * 多例
     * scope    prototype
     */
    @Test
    public void fun5(){
        //1.创建容器对象
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/sam/b_create/applicationContext.xml");
        //2.向容器要User对象
        User user = (User) applicationContext.getBean("user2");

        //3.打印User对象
        System.out.println(user);

        //4.关闭容器
        applicationContext.close();
    }

}
