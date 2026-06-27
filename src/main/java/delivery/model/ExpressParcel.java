package delivery.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExpressParcel extends Parcel{
    private int deliveryHours;

    public ExpressParcel(String recipientName, String deliveryAddress, double parcelWeight, String numberId,int deliveryHours) {
        super(recipientName, deliveryAddress, parcelWeight, numberId);
        this.deliveryHours = deliveryHours;
    }

    public double calculateDeliveryPrice() {
        if (deliveryHours<24) {
            return super.calculateDeliveryPrice() + 500;
        } else {
            return super.calculateDeliveryPrice();
        }
    }

    public void printInfo() {
        super.printInfo();
        LocalDateTime deadline =
                LocalDateTime.now().plusHours(deliveryHours);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        System.out.println(
                "\n Delivery deadline: " +
                        deadline.format(formatter)
        );
    }
}