package ru.mirea.task13.opt3;

public class MyNewList<T> {
    private final int INIT_SIZE = 1;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;
    public void add(T item) {
        if(pointer == array.length-1)
            resize(array.length+1);
        array[pointer++] = item;
    }
    public T get(int index) {
        return (T) array[index];
    }
    public void remove(int index) {
        for (int i = index; i < pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length - 1);
    }
    public int size() {
        return pointer;
    }
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
    public static void main(String[] args) {
        MyNewList<String> brands = new MyNewList<String>();
        brands.add("Nike");
        brands.add("Adidas");
        brands.add("Puma");
        brands.add("Reebok");
        brands.add("Armani");
        brands.add("H&M");
        for (int i = 0; i < brands.size(); i++)
            System.out.println(brands.get(i));
        System.out.println("");
        System.out.println("В списке " + brands.size() + " элементов");
        brands.remove(4);
    }

}