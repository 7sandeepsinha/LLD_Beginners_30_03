package projects.parkingLot.strategy.spotAllocationStrategy;

import projects.parkingLot.repository.ParkingLotRepository;

public class SpotAllocationFactory {

    public static SpotAllocationStrategy getSpotAllocationStrategy(ParkingLotRepository parkingLotRepository){
        return new RandomSpotAllocationStrategy(parkingLotRepository);
    }
}
