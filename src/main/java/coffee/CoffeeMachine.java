package coffee;

public class CoffeeMachine  {

    public void makeCoffee (int waterMl) throws NotEnoughWaterException {
        if(waterMl >= 200) {
            System.out.println("The coffee is ready.");
        } else {
            throw new NotEnoughWaterException("There is not enough water.");
        }
    }

    public int calculateCups (int waterMl, int cupCapacityMl) {
        int quantityOfCups = waterMl/cupCapacityMl;
        return quantityOfCups;
    }

    public void printCoffeeName(String coffeeName) {
        System.out.println(coffeeName.toUpperCase());
    }
}
