package state_dp;



public class VibrationState implements MobileState{
    @Override
    public void doAction(Context context) {
        System.out.println("Phone is in vibration state!");
        context.setMobileState(this);
    }

    public String toString(){
        return "Vibration State";
    }
}
