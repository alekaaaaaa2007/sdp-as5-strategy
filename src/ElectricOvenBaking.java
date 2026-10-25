public class ElectricOvenBaking implements BakingStrategy {
    @Override
    public void bake(String pizzaName) {
        System.out.println("Baking " + pizzaName + " in an electric oven at 250C for 10 minutes.");
    }
}