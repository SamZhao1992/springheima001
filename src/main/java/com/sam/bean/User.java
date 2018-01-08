package com.sam.bean;

/**
 * @Author: SamZhao
 * @Description:
 * @Date: 2018/01/08 15:14
 */
public class User {
    private String name;
    private Integer age;

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void init(){
        System.out.println("初始化...");
    }

    public void destroy(){
        System.out.println("销毁...");
    }

    public User() {
        System.out.println("user created...");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
