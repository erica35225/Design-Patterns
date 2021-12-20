package BuilderDesignPattern;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private UserDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthDate(LocalDate birthDate) {
        Period ageInYears = Period.between(birthDate, LocalDate.now());
        this.age = ageInYears.getYears();
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet()
                + ", " + address.getCity() + ", " + address.getState() + ", "
                + address.getZipcode();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstName, lastName, age);
        return dto;
    }

}
