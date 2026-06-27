package delivery.service;

import delivery.model.Parcel;

public class ParcelService {
    public void printParcelsReport(Parcel[] parcels) {
        for (Parcel p : parcels) {
            p.printInfo();
            p.calculateDeliveryPrice();
            System.out.println("\n Delivery price: " + p.calculateDeliveryPrice());
            System.out.println();
        }
    }
}