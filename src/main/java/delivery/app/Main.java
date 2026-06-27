package delivery.app;

import delivery.model.ExpressParcel;
import delivery.model.FragileParcel;
import delivery.model.Parcel;
import delivery.service.ParcelService;

public class Main {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(
                "Ivan",
                "Moscow",
                12.3,
                "TRK-23423");
        FragileParcel fragileParcel = new FragileParcel(
                "Boris",
                "Kaluga",
                7.95,
                "TRK-67890",
                true);
        ExpressParcel expressParcel = new ExpressParcel(
                "Oleg",
                "Tula",
                31.0,
                "TRK-56796",
                12);
        Parcel singleParsel = new Parcel();

        Parcel[] parcels = {parcel, fragileParcel, expressParcel, singleParsel};

        ParcelService p = new ParcelService ();
        p.printParcelsReport(parcels);
    }
}