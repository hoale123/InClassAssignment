package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Manny", 2, "Purina");
        Dog dog2 = new Dog("Paddy", 4, "Puppy Chow");
        Dog dog3 = new Dog("Toto", 84, "Dirt");

        List<Dog> kennel = new ArrayList<>();
        kennel.add(dog1);
        kennel.add(dog2);
        kennel.add(dog3);

        for (Dog theNextDog: kennel) {
            System.out.println(theNextDog);
        }

        System.out.println("==================");

        dog1.setFoodBrand("Chicken from the island");
        System.out.println(dog1);
        System.out.println("==================");
        for (Dog theNextDog: kennel) {
            System.out.println(theNextDog);
        }

//    List<String> names = new ArrayList<>();
//
//        // List<String> otherNames = new List<>(); // Can't instantiate an interface (List is an interface)
//        System.out.println("The list now has this many elements: " + names.size());
//        names.add("Stephanie");
//        System.out.println("The list now has this many elements: " + names.size());
//        names.add("Kevin C");
//        names.add("Rachel");
//        names.add("Joel");
//
//        // populate a list "inline"
//        List<String> angesList = Arrays.asList("Alonzo", "Ange", "Michael", "Ryan", "Joel again");
//        names.addAll(angesList);
//
//        System.out.println(names);
//        String whoIsThis = names.get(1);
//        System.out.println("We just got... " + whoIsThis);
//
////        String anotherPerson = names.get(9);
////        System.out.println("Just got anotherPerson: " + anotherPerson);
//
//        names.remove(3);
//        System.out.println(names);
//
////        names.clear();
//        System.out.println("The list now has this many elements: " + names.size());
//
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println("Look at " + names.get(i) + " but don't get caught.");
//        }
//        for (String nextPersonsName : names) {
//            System.out.println("Howdy, " + nextPersonsName);
//        }
//
//        String yetAnotherPerson = null;
//        Iterator<String> iter = names.iterator();
//        while(iter.hasNext()) {
//            System.out.println("Look! It's " + iter.next());
//        }


    }

}
