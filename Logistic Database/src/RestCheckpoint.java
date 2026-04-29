package com.gla;

public class RestCheckpoint extends Checkpoint {
    public RestCheckpoint(String id , String loc,double dis,int exp,int acc){
        super(id,loc,dis,exp,acc);
    }

    @Override
    public boolean isCritical() {
        return false;
    }

    @Override
    public String getType() {
        return "Rest checkpoint";
    }

    @Override
    public double Penality() {
        if(!delayedcheck()){
            return 0;
        }
        int d = actual_time - expected_time;
        return d > 30 ? d*0.5 : 0;
    }
}
