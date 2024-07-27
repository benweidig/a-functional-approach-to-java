//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 14 - Design Patterns
//

public interface ShippingService {

    default void ship(Parcel parcel,
                      ShippingStrategy strategy) {
        strategy.ship(parcel);
    }
}