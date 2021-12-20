package BuilderDesignPattern;

public class UserWebDTO implements UserDTO{
    private String firstName;
    private String lastName;
    private int age;

    public UserWebDTO(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserWebDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
