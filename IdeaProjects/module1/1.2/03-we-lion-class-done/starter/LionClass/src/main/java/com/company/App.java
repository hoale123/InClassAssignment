package com.company;
//need a main method to run
public class App {
    public static void main(String[] args) {
        Lion lion1 = new Lion("Simba", 4, 230);
        Lion lion2 = new Lion("Nala", 4, 210);

        System.out.println("lion1 is named " + lion1.getName() );
        System.out.println("lion2 is " + lion2.getAge() + " years old" );


        //lion1.describe(); calling a method in lion1
        //that return name(Simba) + ": a lion that weighs " + weight(230) + " kgs.";
        System.out.println(lion1.describe());
        lion2.roar(2);
        lion2.pounce();
        lion2.eat(20);
        lion2.roar(1);


        System.out.println("There are now " + Lion.getLionCount() + " like");
    }
}
