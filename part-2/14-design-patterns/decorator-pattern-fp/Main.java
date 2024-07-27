//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 14 - Design Patterns
//

public class Main {

    public static void main(String... args) {

        // PARAMETERIZED DECORATION
        CoffeeMaker decoratedCoffeeMaker = Barista.decorate(new BlackCoffeeMaker(),
                                                            coffeeMaker -> new AddMilkDecorator(coffeeMaker,
                                                                                                new MilkCarton()));

        System.out.println("[Parameterized] Ingredients for Café con Leche: " + decoratedCoffeeMaker.getIngredients());

        CoffeeMaker finalCoffeeMaker = Barista.decorate(decoratedCoffeeMaker,
                                                        AddSugarDecorator::new);


        // Add Sugar

        CoffeeMaker lastDecoratedCoffeeMaker = new AddSugarDecorator(decoratedCoffeeMaker);

        System.out.println("[Parameterized] Ingredients after adding sugar: " + lastDecoratedCoffeeMaker.getIngredients());


        // MULTI-DECORATION

        CoffeeMaker multiDecoratedCoffeeMaker = Barista.decorate(new BlackCoffeeMaker(),
                                                                 coffeeMaker -> new AddMilkDecorator(coffeeMaker,
                                                                                                     new MilkCarton()),
                                                                 AddSugarDecorator::new);

                                                                 System.out.println("[Multi] Ingredients: " + lastDecoratedCoffeeMaker.getIngredients());


        // DECORATIONS-HELPER

        var milkCarton = new MilkCarton();

        CoffeeMaker maker = Barista.decorate(new BlackCoffeeMaker(),
                                             Decorations.addMilk(milkCarton),
                                             Decorations.addSugar());

        System.out.println("[Helper] Ingredients: " + lastDecoratedCoffeeMaker.getIngredients());
    }
}
