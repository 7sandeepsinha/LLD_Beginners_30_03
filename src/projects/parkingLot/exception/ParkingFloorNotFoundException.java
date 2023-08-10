package projects.parkingLot.exception;

public class ParkingFloorNotFoundException extends RuntimeException{
    public ParkingFloorNotFoundException() {
    }

    public ParkingFloorNotFoundException(String message) {
        super(message);
    }

    public ParkingFloorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingFloorNotFoundException(Throwable cause) {
        super(cause);
    }

    public ParkingFloorNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
