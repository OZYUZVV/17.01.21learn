package de.marwin.data;

import java.util.function.DoubleFunction;

public class Dog {

private String name;
private int age;
private String breed;
private double weigth;
private String nameOwnew;
private boolean dogStatus;

public Dog(){};

public Dog (String name,int age){
    this.name =  name;
    this.age = age;
}

    public Dog(String name, int age, String breed, double weigth, String nameOwnew) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weigth = weigth;
        this.nameOwnew = nameOwnew;
    }

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

    public String getBreed() {
        return breed;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public String getNameOwnew() {
        return nameOwnew;
    }

    public void setNameOwnew(String nameOwnew) {
        this.nameOwnew = nameOwnew;
    }

    public boolean isDogStatus() {
        return dogStatus;
    }

    public void setDogStatus(boolean dogStatus) {
        this.dogStatus = dogStatus;
    }

    @Override
    public String toString() {
        return "Dog: " +
                name +
                ", age: " + age ;

    }
    public void dogVoice(){
        System.out.println("gav-gav-gav");

    }
    public static void someMethod(){
        System.out.println("hello");
    }
}
