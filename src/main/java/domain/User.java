package domain;

public class User {
    private final String name;
    private final String gender;
    private final String age;

    public User(String name, String gender, String age){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }
}
