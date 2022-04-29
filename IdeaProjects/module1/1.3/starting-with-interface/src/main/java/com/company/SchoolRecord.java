package com.company;
import com.company.interfaces.Auditable;
import com.company.interfaces.Storable;

public class SchoolRecord implements Storable, Auditable {
    public void storeData() {
        System.out.println("Storing that data!");
    }
    public void retrieveData() {
        System.out.println("Getting that data!");
    }

    public void printReport(){
        System.out.println("Printing that data!");
    }

    public void runAudit() {
        System.out.println("auditing");
    }

    public void sendAuditToState() {
        System.out.println("Sent to the State");
    }

    public void sillyMethod(){
        System.out.println("I am Silly");
    }

}
//make it do something in the method