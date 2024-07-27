//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 14 - Design Patterns
//

public class Main {

    public static void main(String... args) {

        var service = new ShippingService() {};
        var parcel = new Parcel();

        service.ship(parcel, ShippingStrategies.standard());
    }
}
