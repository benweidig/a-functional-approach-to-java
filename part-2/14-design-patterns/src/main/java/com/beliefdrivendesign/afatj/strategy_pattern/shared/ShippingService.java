package com.beliefdrivendesign.afatj.strategy_pattern.shared;


public interface ShippingService {

    default void ship(Parcel parcel,
                      ShippingStrategy strategy) {
        strategy.ship(parcel);
    }
}