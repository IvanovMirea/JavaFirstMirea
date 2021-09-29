package ru.mirea.task7.opt2;

public class Task7opt2 {public static void main(String[] args) {
    Shape2 s1 = new Circle2(5.0,"red",false);
    s1.toString();
    Shape2 s2 = new Rectangle(5.0, 5.0,"blue",true);
    s2.toString();
    Shape2 s3 = new Square(3.0,3.0,3.0,"black",false );
    s3.toString();
    System.out.println(s3.toString()+" Его цвет: "+ s1.color +" Заполнен? "+s1.filled);
    System.out.println(s2.toString()+" Его цвет: "+ s2.color +" Заполнен? "+s2.filled);
    System.out.println(s3.toString() +" Его цвет: "+ s3.color +" Заполнен? "+s3.filled);
}

}

