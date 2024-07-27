//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 14 - Design Patterns
//

public final class ShippingStrategies {

    public static ShippingStrategy expedited(boolean requiresSignature) {
        return parcel -> new ExpeditedShipping(requiresSignature);
    }

    public static ShippingStrategy standard() {
        return new StandardShipping();
    }
}