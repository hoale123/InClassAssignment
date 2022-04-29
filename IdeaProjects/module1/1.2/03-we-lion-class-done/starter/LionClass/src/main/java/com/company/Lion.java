package com.company;

public class Lion {
    //Implement Constructor
    public Lion(String nameIn, int ageIn, int weightIn){
        this.name = nameIn;
        this.age = ageIn;
        this.weight = weightIn;
    }
    //Second Constructor
    public Lion(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = defaultWeight;
        lionCount++;
    }
    ////////////////// Private static
    private  static int defaultWeight = 50;
    private static int lionCount = 0;
    public static int getLionCount(){
        return lionCount;
    }
    ////////////////////////// Not Constructor
    private String name;//instants
    private  int age;
    private  int weight;
    /////////////////////////////// Encapsulation
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    ///////////// Implement methods
    public void roar(int volume){
        switch (volume){
            case 0:
                System.out.println("...");
                break;
            case 1:
                System.out.println("rar");
                break;
            case 2:
                System.out.println("Roar");
                break;
            case 3:
                System.out.println("Roar!");
                break;
        }
    }

    public void pounce(){
        System.out.println("Pounced! missed it!");
    }

    public void eat(int size){
        System.out.println("Yummmy");
        this.weight= this.weight + size;
    }

    public String describe(){
        return name + ": a lion that weighs " + weight + " kgs.";
    }
}
