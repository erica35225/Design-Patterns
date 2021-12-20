package BuilderDesignPattern;

import java.time.LocalDate;

public interface UserDTOBuilder {
    UserDTOBuilder withFirstName(String firstName);

    UserDTOBuilder withLastName(String lastName);

    UserDTOBuilder withBirthDate(LocalDate birthDate);

    UserDTOBuilder withAddress(Address address);
    UserDTO build();
}
