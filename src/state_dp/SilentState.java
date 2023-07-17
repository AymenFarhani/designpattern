package state_dp;



public class SilentState implements MobileState{
    @Override
    public void doAction(Context context) {
        System.out.println("Phone is in silent state!");
        context.setMobileState(this);
    }

    public String toString(){
        return "Silent State";
    }
}
