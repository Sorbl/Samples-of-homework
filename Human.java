public class Human {
    private String name;
    private String surname;
    private String age;

    public Human(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return "Hello, my name is " + this.name;
    }

    public String getSurname() {
        return "Hello, my surname is " + this.surname;
    }

    public String getAge() {
        return "Hello, my age is " + this.age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}