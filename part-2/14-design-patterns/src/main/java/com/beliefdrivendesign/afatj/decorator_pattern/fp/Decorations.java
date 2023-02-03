package com.beliefdrivendesign.afatj.decorator_pattern.fp;

import com.beliefdrivendesign.afatj.decorator_pattern.shared.AddMilkDecorator;
import com.beliefdrivendesign.afatj.decorator_pattern.shared.AddSugarDecorator;
import com.beliefdrivendesign.afatj.decorator_pattern.shared.CoffeeMaker;
import com.beliefdrivendesign.afatj.decorator_pattern.shared.MilkCarton;

import java.util.function.Function;

public final class Decorations {

    public static Function<CoffeeMaker, CoffeeMaker> addMilk(MilkCarton milkCarton) {
        return coffeeMaker -> new AddMilkDecorator(coffeeMaker, milkCarton);
    }

    public static Function<CoffeeMaker, CoffeeMaker> addSugar() {
        return AddSugarDecorator::new;
    }

    // ...
}