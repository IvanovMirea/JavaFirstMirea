package ru.mirea.task5.Opt1;

class Plate extends Dish {
    private String foodType;
    public Plate(String name,String colour, String size, String foodType) {
        super(name, colour, size);
        this.foodType=foodType;
    }
    public void TellUsAboutThisDish(){

        System.out.println('\n'+"Прибор: " + super.getName()+ ", Цвет: " + super.getColour() + ", Размер: " + super.getSize() + ", Еда: " + foodType);
    };

}
