package com.company.interfaces;

public interface Storable {
    void storeData();
    void retrieveData();
    void sillyMethod();
    default void runComputerCheck() {
        System.out.println("Computer check audit not yet available");
    };
}







//Method and Constant

//Interfaces. ATM
// Teller, ATM get money from
//Loosely contract
//What their name are, what method are available


//Class - instant state, variable, body, static