package object1;

public class Chair {
    private String color;
    private int legs;
    private boolean woodMaterial;

    public Chair(String color, int legs, boolean woodMaterial){
        this.color = color;
        this.legs = legs;
        this.woodMaterial = woodMaterial;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getLegs(){
        return legs;
    }

    public void setLegs(int legs){
        this.legs = legs;
    }

    public boolean getWoodMaterial(){
        return woodMaterial;
    }

    public void setWoodMaterial(boolean woodMaterial){
        this.woodMaterial = woodMaterial;
    }

}
