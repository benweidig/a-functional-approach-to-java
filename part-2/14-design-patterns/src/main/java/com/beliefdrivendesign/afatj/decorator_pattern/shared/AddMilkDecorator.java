package com.beliefdrivendesign.afatj.decorator_pattern.shared;

import com.beliefdrivendesign.afatj.decorator_pattern.oo.Decorator;
import com.beliefdrivendesign.afatj.decorator_pattern.shared.Coffee;
import com.beliefdrivendesign.afatj.decorator_pattern.shared.CoffeeMaker;
import com.beliefdrivendesign.afatj.decorator_pattern.shared.MilkCarton;

import java.util.ArrayList;
import java.util.List;

public class AddMilkDecorator extends Decorator {

    private final MilkCarton milkCarton;

    public AddMilkDecorator(CoffeeMaker target, MilkCarton milkCarton) {
        super(target);

        this.milkCarton = milkCarton;
    }

    @Override
    public List<String> getIngredients() {
        var newIngredients = new ArrayList<>(super.getIngredients());
        newIngredients.add("Milk");
        return newIngredients;
    }

    @Override
    public Coffee prepare() {
        var coffee = super.prepare();
        coffee = this.milkCarton.pourInto(coffee);
        return coffee;
    }
}