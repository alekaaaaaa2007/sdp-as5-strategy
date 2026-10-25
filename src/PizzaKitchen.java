public class PizzaKitchen {
    private BakingStrategy bakingStrategy;

    public PizzaKitchen(BakingStrategy bakingStrategy) {
        this.bakingStrategy = bakingStrategy;
    }

    public void setBakingStrategy(BakingStrategy bakingStrategy) {
        this.bakingStrategy = bakingStrategy;
    }

    public void bakePizza(String pizzaName) {
        bakingStrategy.bake(pizzaName);
    }
}