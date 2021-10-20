package ru.mirea.task15.opt2;


import java.io.*;
public class ReadInfo {
    public static void main(String[] args){
        try (FileReader reader = new FileReader("C:\\Users\\IVC1-5\\Desktop\\opt15.txt")){
            System.out.println("В файле находится текст: ");
            int c;
            while ((c = reader.read()) != -1)
                System.out.print((char) c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
