package projects.parkingLot.repository;

import projects.parkingLot.exception.ParkingFloorNotFoundException;
import projects.parkingLot.models.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {

    private Map<Integer, ParkingFloor> parkingFloorMap;

    public ParkingFloorRepository() {
        this.parkingFloorMap = new HashMap<>();
    }

    public ParkingFloor get(int parkingFloorId){
        ParkingFloor parkingFloor  = parkingFloorMap.get(parkingFloorId);
        if(parkingFloor == null){
            throw new ParkingFloorNotFoundException("Parking floor not found for : "
                    + parkingFloorId);
        }
        return parkingFloor;
    }

    public void put(ParkingFloor parkingFloor) {
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
    }
}
