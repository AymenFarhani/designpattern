package flyweight_dp;

public class CarImplementation implements Car{
    private final String vehicleType;
    private String vehicleBrand;

    public CarImplementation() {
        this.vehicleType = "Car";
    }

    @Override
    public void assignVehicleBrand(String brand) {
        this.vehicleBrand = brand;
    }

    @Override
    public void build() {
        System.out.println(vehicleType +" Brand: " + vehicleBrand);
    }
}
