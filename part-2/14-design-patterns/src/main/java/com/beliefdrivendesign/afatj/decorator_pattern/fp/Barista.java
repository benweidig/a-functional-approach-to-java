package com.beliefdrivendesign.afatj.decorator_pattern.fp;

import com.beliefdrivendesign.afatj.decorator_pattern.shared.CoffeeMaker;

import java.util.Arrays;
import java.util.function.Function;

public final class Barista {

    public static CoffeeMaker decorate(CoffeeMaker coffeeMaker,
                                       Function<CoffeeMaker, CoffeeMaker> decorator) {

        return decorator.apply(coffeeMaker);
    }

    public static CoffeeMaker decorate(CoffeeMaker coffeeMaker,
                                       Function<CoffeeMaker, CoffeeMaker>... decorators) {

        Function<CoffeeMaker, CoffeeMaker> reducedDecorations =
                Arrays.stream(decorators)
                      .reduce(Function.identity(),
                              Function::andThen);

        return reducedDecorations.apply(coffeeMaker);
    }

    private Barista() {
        // Suppress default constructor.
        // Ensures non-instantiability and non-extendability.
    }
}