package com.gla;

public class Delivery extends Checkpoint {
    public Delivery(String id , String loc,double dis,int exp,int acc){

        super(id,loc,dis,exp,acc);
    }


    public boolean isCritical() {
        return true;
    }


    public String getType() {
        return "Delivery checkpoint";
    }


    public double Penality() {
        if(!delayedcheck()){
            return 0;
        }
        else {
            return (actual_time - expected_time)*2;
        }
    }
}
