package projects.parkingLot.strategy.feeCalculationStrategy;

import projects.parkingLot.models.Ticket;
import projects.parkingLot.models.VehicleType;

public interface FeeCalculationStrategy {

    long getFeeAmount(Ticket ticket);
}
