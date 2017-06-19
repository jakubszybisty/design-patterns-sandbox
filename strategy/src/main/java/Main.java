/**
 * Created by jakub on 12.04.2017.
 */
public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(() -> System.out.println("Choose red!"));
        customer.chooseColor();

        customer.changeAdvisor(() -> System.out.println("Choose blue!"));
        customer.chooseColor();
    }
}
