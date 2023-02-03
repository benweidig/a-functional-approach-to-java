package com.beliefdrivendesign.afatj.strategy_pattern.shared;

import com.beliefdrivendesign.afatj.strategy_pattern.shared.Parcel;
import com.beliefdrivendesign.afatj.strategy_pattern.shared.ShippingStrategy;

public class ExpeditedShipping implements ShippingStrategy {
    private final boolean signatureRequired;

    public ExpeditedShipping(boolean signatureRequired) {

        this.signatureRequired = signatureRequired;
    }

    @Override
    public void ship(Parcel parcel) {
        System.out.println(String.format("Shipping Parcel with '%s' (signature=%s)", getClass().getSimpleName(), this.signatureRequired));
    }
}
