//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 14 - Design Patterns
//

public class Main  {

    public static void main(String... args) {

        var service = new ShippingService() {};
        var parcel = new Parcel();
        var strategy = new ExpeditedShipping(true);

        service.ship(parcel, strategy);
    }
}
