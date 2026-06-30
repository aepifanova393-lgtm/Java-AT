package coffee;

public class NotEnoughWaterException extends RuntimeException {

    public NotEnoughWaterException (String message) {
        super(message);
    }
}
