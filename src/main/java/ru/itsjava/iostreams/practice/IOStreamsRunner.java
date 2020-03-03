package ru.itsjava.iostreams.practice;

import java.io.*;
import java.util.ArrayList;

public class IOStreamsRunner {

    public static void main(String[] args) {
        // BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        /* try {
            String input = reader.readLine();
            System.out.println("Наша строка: " + input);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         */
/*
        try (BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));) {
            String input = reader.readLine();
            System.out.println("Наша строка: " + input);
        } catch (IOException e) {
            e.printStackTrace();
        }

 */
 /*
        ArrayList<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)))) {
            String newString;
            while (!"exit".equals(newString = reader.readLine())) {
                strings.add(newString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File("testfile.txt");
        try (PrintWriter writer = new PrintWriter(file)) {
           writer.println("Hello again!");
            writer.println("Spring!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(
                new FileReader(file))) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

  */

    }
}