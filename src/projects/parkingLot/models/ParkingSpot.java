package projects.parkingLot.models;

public class ParkingSpot extends BaseModel{
    private int number;
    private VehicleType supportedVehicleType;
    private Status status;
    private Vehicle vehicle;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public VehicleType getSupportedVehicleType() {
        return supportedVehicleType;
    }

    public void setSupportedVehicleType(VehicleType supportedVehicleType) {
        this.supportedVehicleType = supportedVehicleType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "number=" + number +
                ", supportedVehicleType=" + supportedVehicleType +
                ", status=" + status +
                ", vehicle=" + vehicle +
                '}';
    }
}