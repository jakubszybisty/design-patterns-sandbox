import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Created by jakub on 12.04.2017.
 */
public interface SandwichFactory {

    Sandwich getInstance(SandwichType type);

    static SandwichFactory factory() {
        Map<SandwichType, Supplier<Sandwich>> sandwiches = new HashMap<>();
        sandwiches.put(SandwichType.MEAT, MeatSandwich::new);
        sandwiches.put(SandwichType.VEGE, VegeSandwich::new);
        return type -> sandwiches.get(type).get();
    }
}
