package object1;
import java.util.logging.Logger;
public class Main {

    public static void main(String... args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person = new Person("Nick", 37, 99);
        System.out.println(("height: " + person.getHeight()));

        Chair chair = new Chair("red", 4, true);
        System.out.println(("Chair color: " + chair.getColor() + "  Legs: " + chair.getLegs() +
                "  Wood material: " + chair.getWoodMaterial()));

        Car car1 = new Car("BMW", "Black", 1996, false);
        System.out.println("Vehicle make: " + car1.getMake() + "  Color: " + car1.getColor() +
                " Year: " + car1.getYear() + " Manual: " + car1.getIsManual());

        Person[] people = new Person[3];
        Person people1 = new Person("Laura", 23, 88);
        Person people2 = new Person("Bobby", 65, 90);
        Person people3 = new Person("Susan", 34, 89);
        people[0] = people1;
        people[1] = people2;
        people[2] = people3;

        Chair[] chairs = new Chair[2];
        Chair chair1 = new Chair("Blue", 5, false);
        Chair chair2 = new Chair("Brown", 3, true);
        chairs[0]=chair1;
        chairs[1]= chair2;

        Dog[] dogs = new Dog[2];
        Dog dog1 = new Dog("Snoopy", "Retriever", true);
        Dog dog2 = new Dog("Linda", "Bulldog", false);
        dogs[0] = dog1;
        dogs[1] = dog2;

        Car[] cars = new Car[2];
        Car cars1 = new Car("Honda", "Pink", 2000, true);
        Car cars2 = new Car("Jeep", "Orange", 1990, false);
        cars[0] = cars1;
        cars[1] = cars2;
    }
}
