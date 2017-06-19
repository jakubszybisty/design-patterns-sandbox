/**
 * Created by jakub on 12.04.2017.
 */
public class Customer {

    private ColorPickerAdviser colorPickerAdviser;

    public Customer(ColorPickerAdviser adviser) {
        this.colorPickerAdviser = adviser;
    }

    public void changeAdvisor(ColorPickerAdviser adviser) {
        this.colorPickerAdviser = adviser;
    }

    public void chooseColor() {
        colorPickerAdviser.advise();
    }
}
