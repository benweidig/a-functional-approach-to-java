//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 14 - Design Patterns
//

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