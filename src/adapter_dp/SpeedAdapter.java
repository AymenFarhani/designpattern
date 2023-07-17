package adapter_dp;

//Adapter By inheritance
public class SpeedAdapter extends CarSpeedMeasureInUS implements CarSpeedMeasure{


    @Override
    public void getCarSpeedPerHour(double distance, double time) {
        double distanceFromKmToMile = distance * 0.62137;
        double result = super.getCarSpeedMilePerHour(distanceFromKmToMile, time);
        super.displaySpeed(result);
    }
}
