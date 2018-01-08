package com.sam.b_create;

import com.sam.bean.User;

/**
 * @Author: SamZhao
 * @Description:
 * @Date: 2018/01/08 16:08
 */
public class UserFactory {
    public static User createUser() {
        System.out.println("静态工厂创建...");
        return new User();
    }
    public User createUser2() {
        System.out.println("实例工厂（动态工厂）创建...");
        return new User();
    }
}
