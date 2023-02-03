package com.beliefdrivendesign.afatj.strategy_pattern.shared;

import com.beliefdrivendesign.afatj.strategy_pattern.shared.Parcel;
import com.beliefdrivendesign.afatj.strategy_pattern.shared.ShippingStrategy;

public class StandardShipping implements ShippingStrategy {
    @Override
    public void ship(Parcel parcel) {
System.out.println("Shipping Parcel with '" + getClass().getSimpleName() + "'");
    }
}
