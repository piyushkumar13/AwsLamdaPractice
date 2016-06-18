package com.practice.piyush.customhandlers;


import java.util.Arrays;

public class Input {

    private String name;
    private int age;
    private String city;
    private String state;
    private String[] degrees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String[] getDegrees() {
        return degrees;
    }

    public void setDegrees(String[] degrees) {
        this.degrees = degrees;
    }

    @Override
    public String toString() {
        return "Input{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", degrees=" + Arrays.toString(degrees) +
                '}';
    }
}
