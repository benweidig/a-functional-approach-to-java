package com.beliefdrivendesign.afatj.strategy_pattern.fp;

import com.beliefdrivendesign.afatj.strategy_pattern.shared.ExpeditedShipping;
import com.beliefdrivendesign.afatj.strategy_pattern.shared.ShippingService;
import com.beliefdrivendesign.afatj.strategy_pattern.shared.ShippingStrategy;
import com.beliefdrivendesign.afatj.strategy_pattern.shared.StandardShipping;

public final class ShippingStrategies {

    public static ShippingStrategy expedited(boolean requiresSignature) {
        return parcel -> new ExpeditedShipping(requiresSignature);
    }

    public static ShippingStrategy standard() {
        return new StandardShipping();
    }
}