package Logistic;

public class FuelCheckPoint extends CheckPoint {
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
        if(!delayedcheck()){
            return 0;
        }
        else {
            return 10;
        }
    }
}
