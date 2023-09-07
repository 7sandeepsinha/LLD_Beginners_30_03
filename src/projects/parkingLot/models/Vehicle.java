package projects.parkingLot.models;

public class Vehicle extends BaseModel{
    private String number;
    private String color;
    private String make;
    private VehicleType vehicleType;

    public Vehicle() {
    }

    public Vehicle(String number, String color, String make, VehicleType vehicleType) {
        this.number = number;
        this.color = color;
        this.make = make;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "number='" + number + '\'' +
                ", color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
