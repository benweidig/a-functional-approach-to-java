package com.beliefdrivendesign.afatj.strategy_pattern.oo;

import com.beliefdrivendesign.afatj.strategy_pattern.shared.ExpeditedShipping;
import com.beliefdrivendesign.afatj.strategy_pattern.shared.Parcel;
import com.beliefdrivendesign.afatj.strategy_pattern.shared.ShippingService;

public class Main  {

    public static void main(String... args) {

        var service = new ShippingService() {};
        var parcel = new Parcel();
        var strategy = new ExpeditedShipping(true);

        service.ship(parcel, strategy);
    }
}
