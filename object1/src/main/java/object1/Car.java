package object1;

public class Car {
    private String make;
    private String color;
    private int year;
    private boolean isManual;

    public Car (String make, String color, int year, boolean isManual){
        this.make = make;
        this.color = color;
        this.year = year;
        this.isManual = isManual;
    }

    public String getMake(){
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public boolean getIsManual(){
        return isManual;
    }

    public void setIsManual(boolean isManual){
        this.isManual = isManual;
    }
}
