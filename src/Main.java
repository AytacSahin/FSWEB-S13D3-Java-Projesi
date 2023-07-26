public class Main {
    public static void main(String[] args) {
        System.out.println("___________________________________________________");
        Person JohnPerson = new Person("John", "Doe", 19);
        System.out.println("Welcome dear " + JohnPerson + ", here are your informations:");
        System.out.println("Firstname: " + JohnPerson.getFirstName());
        System.out.println("Lastname: " + JohnPerson.getLastName());
        System.out.println("Age: " + JohnPerson.getAge());
        System.out.println("Is teen method: " + JohnPerson.isTeen());
        System.out.println("___________________________________________________");
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}