package ru.mirea.task15.opt4;

import java.io.*;
import java.util.Scanner;

public class AddText {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text;
        try(FileWriter writer = new FileWriter("C:\\Users\\IVC1-5\\Desktop\\opt15.txt", true)) {
            System.out.println("Введите текст, которым надо дополнить файл");
            text = scanner.nextLine();
            writer.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage()); }
    }
}
