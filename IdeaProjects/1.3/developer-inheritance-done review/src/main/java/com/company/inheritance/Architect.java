package com.company.inheritance;

public class Architect extends TeamLead{
    public void createTechRoadMap(){
        System.out.println(this.name + " Here's our roadmap to success.");
    }

    public void evaluateVendor() {
        System.out.println(this.name + " says: They're fine. I could do it better.");
    }

    public int estimateStoryPoints(){
        //override
        System.out.println(this.name + " says: i can delivery that in story point");
        return 1;
    }
}
