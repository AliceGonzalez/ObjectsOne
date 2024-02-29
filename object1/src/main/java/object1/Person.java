package object1;

// Define a class
class Person {
    // Define Instance Variables
    // different for each object!
    String name;
    int age;

    int height;


    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.height = 0 ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}