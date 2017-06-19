/**
 * Created by jakub on 12.04.2017.
 */
public class Main {

    public static void main(String[] args) {
        SandwichFactory sandwichFactory = SandwichFactory.factory();
        Sandwich sandwich = sandwichFactory.getInstance(SandwichType.MEAT);
        sandwich.describe();

        Sandwich vegeSandwich = sandwichFactory.getInstance(SandwichType.VEGE);
        vegeSandwich.describe();
    }
}

