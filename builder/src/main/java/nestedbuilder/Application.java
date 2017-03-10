package nestedbuilder;

/**
 * Created by jakub on 07.03.2017.
 */
public class Application {

    public static void main(String[] args) {
        Person person = Person
                .builder()
                .withLastName("Murphy")
                .withFirstName("Steve")
                .withMiddleName("NA")
                .withSalutation("Hello")
                .withSuffix("DEA Agent")
                .withStreetAdress("Daytona Beach")
                .withCity("Los Angeles")
                .withState("California")
                .isFemale(false)
                .isEmployed(true)
                .build();

        System.out.println(person);
    }
}
