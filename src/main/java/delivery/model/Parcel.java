package delivery.model;

public class Parcel {

    private String recipientName;
    private String deliveryAddress;
    protected double parcelWeight;
    String numberId;

    // конструкторы
    public Parcel(String recipientName, String deliveryAddress, double parcelWeight, String numberId) {
        this.recipientName = recipientName;
        this.deliveryAddress = deliveryAddress;
        this.parcelWeight = parcelWeight;
        this.numberId = numberId;
    }

    public Parcel() {
    };

    // геттеры и сеттеры для полей
    public String getRecipientName() {
        return recipientName;
    }
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    public void setDeliveryAddress (String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public double getParcelWeight() {
        return parcelWeight;
    }
    public void setParcelWeight(double parcelWeight) {
        this.parcelWeight = parcelWeight;
    }

    //методы
    public double calculateDeliveryPrice() {
        double basicPrice = 100 + parcelWeight * 30;
        return basicPrice;
    }

    public void printInfo() {
        System.out.printf("Имя получателя: %s, адрес доставки: %s, вес посылки: %.2f, трек-номер: %s",
                recipientName, deliveryAddress, parcelWeight, numberId);
    }

}