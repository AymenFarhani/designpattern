package state_dp;

public class Context {
    private MobileState mobileState;

    public Context() {
        this.mobileState = null;
    }

    public MobileState getMobileState() {
        return mobileState;
    }

    public void setMobileState(MobileState mobileState) {
        this.mobileState = mobileState;
    }
}
