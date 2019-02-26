package com.max.bmii.hello;

public class Person {
    float weight;
    float height;//屬性
    public float bmi(){
        float bmi = weight / (height * height);
        return bmi;
    } //方法
    public void hello(){
        System.out.println("Hello ");
    }
    public void hello(String name){
        System.out.println(name + ", Hello ~");
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
