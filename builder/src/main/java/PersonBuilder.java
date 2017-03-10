

/**
 * Created by jakub on 07.03.2017.
 */
public class PersonBuilder {
    private String lastName;
    private String firstName;
    private String middleName;
    private String salutation;
    private String suffix;
    private String streetAddress;
    private String city;
    private String state;
    private boolean isFemale;
    private boolean isEmployed;
    private boolean isHomeOwner;

    public PersonBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public PersonBuilder withSalutation(String salutation) {
        this.salutation = salutation;
        return this;
    }

    public PersonBuilder withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    public PersonBuilder withStreetAdress(String streetAddress) {
        this.streetAddress = streetAddress;
        return this;
    }

    public PersonBuilder withCity(String city) {
        this.city = city;
        return this;
    }

    public PersonBuilder withState(String state) {
        this.state = state;
        return this;
    }

    public PersonBuilder isFemale(boolean isFemale) {
        this.isFemale = isFemale;
        return this;
    }

    public PersonBuilder isEmployed(boolean isEmployed) {
        this.isEmployed = isEmployed;
        return this;
    }

    public PersonBuilder isHomeOwner(boolean isHomeOwner) {
        this.isHomeOwner = isHomeOwner;
        return this;
    }

    public Person build() {
        return new Person(
                lastName, firstName, middleName, salutation,
                suffix, streetAddress, city, state, isFemale,
                isEmployed, isHomeOwner);
    }
}
