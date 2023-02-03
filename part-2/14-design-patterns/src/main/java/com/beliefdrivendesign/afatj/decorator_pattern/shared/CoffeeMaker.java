package com.beliefdrivendesign.afatj.decorator_pattern.shared;

import java.util.List;

public interface CoffeeMaker {

    List<String> getIngredients();

    Coffee prepare();
}