//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 14 - Design Patterns
//

public class Main {

    public static void main(String... args) {

        // Café con Leche

        CoffeeMaker coffeeMaker = new BlackCoffeeMaker();
        CoffeeMaker decoratedCoffeeMaker = new AddMilkDecorator(coffeeMaker, new MilkCarton());

        System.out.println("Ingredients for Café con Leche: " + decoratedCoffeeMaker.getIngredients());

        // Add Sugar

        CoffeeMaker lastDecoratedCoffeeMaker = new AddSugarDecorator(decoratedCoffeeMaker);

        System.out.println("Ingredients after adding sugar: " + lastDecoratedCoffeeMaker.getIngredients());
    }
}
