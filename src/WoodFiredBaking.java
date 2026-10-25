public class WoodFiredBaking implements BakingStrategy {
    @Override
    public void bake(String pizzaName) {
        System.out.println("Baking " + pizzaName + " in a wood-fired oven at 450C for 2 minutes.");
    }
}