package com.company;

public class TV {
    private boolean on;
    private int channel;

    public TV(int channel){
        this.channel = channel;
    }

    public int getChannel() {
//        return channel;
        return this.channel = channel;
    }

    public void increaseChannel(){
        this.channel++;
    }


    public boolean isOn(){
        return on;
    }

//    dont want to expose setOn
    public void setOn(boolean on) {
        this.on = on;
    }

    public void turnOn(){
        //state is true
        this.on = true;
        // not a state just a return statement.
//        return true;

    }

    public void turnOff(){
        this.on = false;
    }
}


