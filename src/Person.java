public class Person {
    private String firstname;
    private String lastname;
    private Integer age;
    private String address;
    private String favouriteColour;
    private Integer id;

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", favouriteColour='" + favouriteColour + '\'' +
                ", id=" + id +
                '}';
    }

    public Person(Builder builder) {
        this.firstname = builder.getFirstname();
        this.lastname = builder.getLastname();
        this.age = builder.getAge();
        this.address = builder.getAddress();
        this.favouriteColour = builder.getFavouriteColour();
        this.id = builder.getId();

    }
}
