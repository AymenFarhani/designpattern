package state_dp;

public class ApplicationTest {
    public static void main(String[] args) {
        Context context = new Context();

        SilentState silentState = new SilentState();
        silentState.doAction(context);
        System.out.println(context.getMobileState().toString());

        VibrationState vibrationState = new VibrationState();
        vibrationState.doAction(context);
        System.out.println(context.getMobileState().toString());

        NormalState normalState = new NormalState();
        normalState.doAction(context);
        System.out.println(context.getMobileState().toString());
    }

}
