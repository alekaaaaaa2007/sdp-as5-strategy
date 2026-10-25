public class Main {
    public static void main(String[] args) {
        PizzaKitchen kitchen = new PizzaKitchen(new WoodFiredBaking());
        kitchen.bakePizza("Margherita");

        kitchen.setBakingStrategy(new ElectricOvenBaking());
        kitchen.bakePizza("Pepperoni");

        kitchen.setBakingStrategy(new ConveyorOvenBaking());
        kitchen.bakePizza("Four Cheese");
    }
}