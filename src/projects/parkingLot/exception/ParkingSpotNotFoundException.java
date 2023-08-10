package projects.parkingLot.exception;

public class ParkingSpotNotFoundException extends RuntimeException{
    public ParkingSpotNotFoundException() {
    }

    public ParkingSpotNotFoundException(String message) {
        super(message);
    }

    public ParkingSpotNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingSpotNotFoundException(Throwable cause) {
        super(cause);
    }

    public ParkingSpotNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
