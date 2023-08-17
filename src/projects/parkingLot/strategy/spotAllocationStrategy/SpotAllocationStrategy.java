package projects.parkingLot.strategy.spotAllocationStrategy;

import projects.parkingLot.models.Gate;
import projects.parkingLot.models.ParkingSpot;
import projects.parkingLot.models.VehicleType;

public interface SpotAllocationStrategy {
    ParkingSpot getSpot(VehicleType vehicleType, Gate gate);
}
