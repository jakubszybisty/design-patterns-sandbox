package nestedbuilder;

/**
 * Created by jakub on 07.03.2017.
 */
public class Person {
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

    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getSalutation() {return salutation;}
    public String getSuffix() { return suffix; }
    public String getStreetAddress() { return streetAddress; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public boolean isFemale() { return isFemale; }
    public boolean isEmployed() { return isEmployed; }
    public boolean isHomeOwner() { return isHomeOwner; }

    public Person(PersonBuilder builder) {
        this.lastName = builder.lastName;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.salutation = builder.salutation;
        this.suffix = builder.suffix;
        this.streetAddress = builder.streetAddress;
        this.city = builder.city;
        this.state = builder.state;
        this.isFemale = builder.isFemale;
        this.isEmployed = builder.isEmployed;
        this.isHomeOwner = builder.isHomeOwner;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", salutation='" + salutation + '\'' +
                ", suffix='" + suffix + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", isFemale=" + isFemale +
                ", isEmployed=" + isEmployed +
                ", isHomeOwner=" + isHomeOwner +
                '}';
    }

    public static class PersonBuilder {
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
            return new Person(this);
        }
    }

}
