package BuilderDesignPattern;

import java.time.LocalDate;

public class Client {
    public static void main(String args[]) {
        User user = createUser();
        UserDTOBuilder Builder = new UserWebDTOBuilder();
        UserDTO dto = directBuild(Builder,user);
        System.out.println(dto);
    }

    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
         return builder.withFirstName(user.getFirstName())
                 .withLastName(user.getLastName())
                 .withAddress(user.getAddress())
                 .withBirthDate(user.getBirthDate())
                 .build();
    }

    private static User createUser() {
        User user = new User();
        user.setFirstName("Erica");
        user.setLastName("Rajput");
        user.setBirthDate(LocalDate.of(1991, 11, 25));
        Address address = new Address();
        address.setHouseNumber("390");
        address.setStreet("Ram - Market");
        address.setCity("Palampur");
        address.setState("Himachal Pradesh");
        address.setZipcode("176102");
        user.setAddress(address);
        return user;
    }
}
