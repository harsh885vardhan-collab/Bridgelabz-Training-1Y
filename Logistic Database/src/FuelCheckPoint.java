package com.gla;

public class FuelCheckPoint extends Checkpoint {
    public FuelCheckPoint(String id , String loc,double dis,int exp,int acc){
        super(id,loc,dis,exp,acc);
    }

    @Override
    public boolean isCritical() {
        return true;
    }

    @Override
    public String getType() {
        return "Fuel checkpoint";
    }

    @Override
    public double Penality() {
        return delayedcheck() ? 10 : 0;
    }
}
