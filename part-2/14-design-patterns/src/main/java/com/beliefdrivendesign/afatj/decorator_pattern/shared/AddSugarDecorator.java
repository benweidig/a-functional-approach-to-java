package com.beliefdrivendesign.afatj.decorator_pattern.shared;

import com.beliefdrivendesign.afatj.decorator_pattern.oo.Decorator;
import com.beliefdrivendesign.afatj.decorator_pattern.shared.Coffee;
import com.beliefdrivendesign.afatj.decorator_pattern.shared.CoffeeMaker;
import com.beliefdrivendesign.afatj.decorator_pattern.shared.MilkCarton;

import java.util.ArrayList;
import java.util.List;

public class AddSugarDecorator extends Decorator {

    public AddSugarDecorator(CoffeeMaker target) {
        super(target);
    }

    @Override
    public List<String> getIngredients() {
        var newIngredients = new ArrayList<>(super.getIngredients());
        newIngredients.add("Sugar");
        return newIngredients;
    }

    @Override
    public Coffee prepare() {
        var coffee = super.prepare();
        // add sugar
        return coffee;
    }
}