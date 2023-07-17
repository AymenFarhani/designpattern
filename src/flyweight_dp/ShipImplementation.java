package flyweight_dp;

public class ShipImplementation implements Car{

    private final String vehicleType;
    private String vehicleBrand;

    public ShipImplementation() {
        this.vehicleType = "Ship";
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
