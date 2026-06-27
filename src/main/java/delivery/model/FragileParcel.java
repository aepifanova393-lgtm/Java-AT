package delivery.model;

public class FragileParcel extends Parcel {
    private boolean requiresCarefulHandling;

    public FragileParcel(String recipientName, String deliveryAddress, double parcelWeight, String numberId, boolean requiresCarefulHandling){
        super(recipientName, deliveryAddress, parcelWeight, numberId);
        this.requiresCarefulHandling = requiresCarefulHandling;
    }

    public double calculateDeliveryPrice() {
        return super.calculateDeliveryPrice() + 200;
    }

    public void printInfo() {
        super.printInfo();
        System.out.printf( "\n Handle with care: %b", requiresCarefulHandling);
    }
}