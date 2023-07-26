public class Person {
    // instance variables tanımlamam gerekiyor:
    String firstName;
    String lastName;
    int age;
    // instance variables'lara ek verdim:
    double height;
    String email;
    int weight;

    // constructor metodlar:
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double height, String email, int weight) {
        // constructor chaining:
        this(firstName, lastName, age);

        this.height = height;
        this.email = email;
        this.weight = weight;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public int getAge() {

        return age;
    }

    public boolean isTeen() {

        return (age <= 19 && age >= 13);
    }

    @Override
    public String toString() {

        return firstName + " " + lastName;
    }
}
