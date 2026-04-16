package activity13;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("===== ACTIVITY 13 =====");

        Repository<String> guestNames = new Repository<>();
        guestNames.add("Alice");
        guestNames.add("Bob");
        guestNames.add("Charlie");

        System.out.println("Total Guests: " + guestNames.size());
        System.out.println("All Guests: " + guestNames.getAll());

        System.out.println("\n--- COMPLEX TYPE ---");

        Repository<Person> personRepo = new Repository<>();
        personRepo.add(new Person("John Doe", 25));
        personRepo.add(new Person("Jane Smith", 30));

        Person loadedPerson = personRepo.get(0);
        Result<Person> result = new Result<>(loadedPerson, "Load Successful", true);

        result.display();
    }
}

