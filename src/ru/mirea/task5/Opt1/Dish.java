package ru.mirea.task5.Opt1;

public abstract class Dish {
    private String name;
    private String colour;
    private String size;

    public String getColour() {
        return colour;
    }

    public String getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public Dish (String name, String colour, String size){
        this.name=name;
        this.colour=colour;
        this.size=size;
    }
    public abstract void TellUsAboutThisDish();
}
