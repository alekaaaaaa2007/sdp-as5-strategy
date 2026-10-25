public class ConveyorOvenBaking implements BakingStrategy {
    @Override
    public void bake(String pizzaName) {
        System.out.println("Baking " + pizzaName + " on a conveyor oven at 300C for 5 minutes.");
    }
}