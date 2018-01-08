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

    public User(String name, Car car) {
        System.out.println("User(String name, Car car)...");
        this.name = name;
        this.car = car;
    }

    public User(Integer name, Car car) {
        System.out.println("User(String name, Car car)...");
        this.age = name;
        this.car = car;
    }

    public User(Car car, String name) {
        System.out.println("User(Car car, String name)...");
        this.name = name;
        this.car = car;
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
