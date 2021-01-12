package Lexicon;

public class Person {

    private int age;
    private String name;
    private String email;
    private String gender;

    public Person() {
    }

    public Person(int age, String name, String email, String gender) {
        this.age = age;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}