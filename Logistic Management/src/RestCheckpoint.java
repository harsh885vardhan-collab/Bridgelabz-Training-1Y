package Logistic;

public class RestCheckpoint extends CheckPoint{
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
        if(d>30){
            return d*0.5;
        }
        return 0;
    }
}
