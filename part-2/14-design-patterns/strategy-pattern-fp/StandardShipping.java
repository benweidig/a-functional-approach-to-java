//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 14 - Design Patterns
//

public class StandardShipping implements ShippingStrategy {

    @Override
    public void ship(Parcel parcel) {
        System.out.println("Shipping Parcel with '" + getClass().getSimpleName() + "'");
    }
}
