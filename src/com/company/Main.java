package com.company;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        firstName firstName = new firstName("Afke");
        save(firstName);

    }

    public static void save (ISaveable values) {
        for(int i = 0; i <= values.write().size(); i++){
            System.out.println(values.write().get(i));
        }
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" + "1 to enter a string " + "0 to quit");

        while(!quit) {
            System.out.println("Choose a option");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0 : quit = true;
                        break;
                case 1:
                    System.out.println("Enter a string ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }


}
