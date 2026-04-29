package Logistic;

public class Delivery extends CheckPoint{
    public Delivery(String id , String loc,double dis,int exp,int acc){
        super(id,loc,dis,exp,acc);
    }

    @Override
    public boolean isCritical() {
        return true;
    }

    @Override
    public String getType() {
        return "Delivery checkpoint";
    }

    @Override
    public double Penality() {
        if(!delayedcheck()){
            return 0;
        }
        else {
            return (actual_time - expected_time)*2;
        }
    }
}
