//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 14 - Design Patterns
//

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