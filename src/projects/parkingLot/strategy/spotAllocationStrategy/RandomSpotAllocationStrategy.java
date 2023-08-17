package projects.parkingLot.strategy.spotAllocationStrategy;

import projects.parkingLot.exception.ParkingSpotNotFoundException;
import projects.parkingLot.models.*;
import projects.parkingLot.repository.ParkingLotRepository;

public class RandomSpotAllocationStrategy implements SpotAllocationStrategy{
    private ParkingLotRepository parkingLotRepository;

    public RandomSpotAllocationStrategy(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    @Override
    public ParkingSpot getSpot(VehicleType vehicleType, Gate gate) {
        ParkingLot parkingLot = parkingLotRepository.getParkingLotFromGate(gate);
        int currentFloor = gate.getFloorNumber();

        ParkingFloor parkingFloor = parkingLot.getParkingFloors().get(currentFloor-1);
        for(ParkingSpot parkingSpot : parkingFloor.getParkingSpots()){
            if(parkingSpot.getSupportedVehicleType().equals(vehicleType)
            && parkingSpot.getStatus().equals(Status.AVAILABLE)){
                return parkingSpot;
            }
        }

        for(ParkingFloor floor : parkingLot.getParkingFloors()){
            for(ParkingSpot parkingSpot : floor.getParkingSpots()) {
                if(parkingSpot.getSupportedVehicleType().equals(vehicleType)
                        && parkingSpot.getStatus().equals(Status.AVAILABLE)){
                    return parkingSpot;
                }
            }
        }

        throw new ParkingSpotNotFoundException("No parking spot available for this vehicle type" + vehicleType.name() );
    }
}
