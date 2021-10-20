package ru.mirea.task15.opt3;

import java.io.*;
import java.util.Scanner;

public class RewriteInfo {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text;
        try(FileWriter writer = new FileWriter("C:\\Users\\IVC1-5\\Desktop\\opt15.txt", false)) {
            System.out.println("Введите информацию, которую необходимо передать в текстовый файл");
            text = scanner.nextLine();
            writer.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
