package com.company;

import java.util.Objects;

public class Dog {    private String name;
    private int age;
    private String foodBrand;

    public Dog(String name, int age, String foodBrand) {
        this.name = name;
        this.age = age;
        this.foodBrand = foodBrand;
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

    public String getFoodBrand() {
        return foodBrand;
    }

    public void setFoodBrand(String foodBrand) {
        this.foodBrand = foodBrand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name) && Objects.equals(foodBrand, dog.foodBrand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, foodBrand);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", foodBrand='" + foodBrand + '\'' +
                '}';
    }
}
