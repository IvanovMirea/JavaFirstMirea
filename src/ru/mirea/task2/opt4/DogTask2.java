package ru.mirea.task2.opt4;

public class DogTask2 {
    private String name;
    private int age;
    public DogTask2(String n, int a){
        name = n;
        age = a;
    }
    public DogTask2(String n){
        name = n;
        age = 0;}
    public DogTask2(){
        name = "Pup";
        age = 0;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return this.name+", age "+this.age;
    }
    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}
