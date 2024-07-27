//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 14 - Design Patterns
//

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