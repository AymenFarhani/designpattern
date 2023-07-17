package state_dp;



public class NormalState implements MobileState{
    @Override
    public void doAction(Context context) {
        System.out.println("Phone is in normal state!");
        context.setMobileState(this);
    }

    public String toString(){
        return "Normal State";
    }
}
