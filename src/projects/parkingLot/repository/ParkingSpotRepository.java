package projects.parkingLot.repository;

import projects.parkingLot.exception.ParkingFloorNotFoundException;
import projects.parkingLot.exception.ParkingSpotNotFoundException;
import projects.parkingLot.models.ParkingFloor;
import projects.parkingLot.models.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpotRepository {
    private Map<Integer, ParkingSpot> parkingSpotMap;

    public ParkingSpotRepository() {
        this.parkingSpotMap = new HashMap<>();
    }

    public ParkingSpot get(int parkingSpotId){
        ParkingSpot parkingSpot  = parkingSpotMap.get(parkingSpotId);
        if(parkingSpot == null){
            throw new ParkingSpotNotFoundException("Parking floor not found for : "
                    + parkingSpot);
        }
        return parkingSpot;
    }

    public void put(ParkingSpot ParkingSpot) {
        parkingSpotMap.put(ParkingSpot.getId(), ParkingSpot);
    }
}
