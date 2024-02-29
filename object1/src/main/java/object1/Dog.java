package object1;

public class Dog {
    private String name;
    private String breed;
    private boolean bark;

    public Dog(String name, String breed, boolean bark){
        this.name = name;
        this.breed = breed;
        this.bark = bark;
    }

    public String getName(){
        return name;
    }

    public void getName(String name){
        this.name = name;
    }

    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }

    public boolean getBarks(){
        return bark;
    }

    public void setBarks(boolean bark){
        this.bark = bark;
    }


}
