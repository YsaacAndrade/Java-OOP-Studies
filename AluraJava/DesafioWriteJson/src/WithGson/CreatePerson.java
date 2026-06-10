package WithGson;

public class CreatePerson {
    private final String name;
    private final String city;
    private final String age;

    public CreatePerson(String name, String city, String age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getAge() {
        return age;
    }
}
