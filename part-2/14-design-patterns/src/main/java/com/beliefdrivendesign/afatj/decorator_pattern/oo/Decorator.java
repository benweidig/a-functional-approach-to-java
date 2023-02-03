package com.beliefdrivendesign.afatj.decorator_pattern.oo;

import com.beliefdrivendesign.afatj.decorator_pattern.shared.Coffee;
import com.beliefdrivendesign.afatj.decorator_pattern.shared.CoffeeMaker;

import java.util.List;

public abstract class Decorator implements CoffeeMaker {

    private final CoffeeMaker target;

    public Decorator(CoffeeMaker target) {
        this.target = target;
    }

    @Override
    public List<String> getIngredients() {
        return this.target.getIngredients();
    }

    @Override
    public Coffee prepare() {
        return this.target.prepare();
    }
}