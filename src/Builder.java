public class Builder {
    private String firstname;
    private String lastname;
    private Integer age;
    private String address;
    private Integer id;
    private String favouriteColour;

    public Builder(String firstname, String lastname, Integer age, String address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.address = address;

    }

    public Builder setId(Integer id) {
        this.id = id;
        return this;
    }

    public Builder setFavouriteColour(String favouriteColour) {
        this.favouriteColour = favouriteColour;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public Integer getId() {
        return id;
    }

    public String getFavouriteColour() {
        return favouriteColour;
    }

    public String getLastname() {
        return lastname;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public Person build() {
        return new Person(this);
    }
}
