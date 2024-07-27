//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 14 - Design Patterns
//

import java.util.List;

public interface CoffeeMaker {

    List<String> getIngredients();

    Coffee prepare();
}