package ru.spb.aog.iostreams.swap_data_two_files;
// 2. Даны 2 файла. В каждом файле содержится текст. Необходимо поменять их местами.

import java.io.*;

import java.util.ArrayList;

public class SwapDataTwoFiles {

    private static final String PATH_FILE_A =
            "src/main/resources/fileA.txt";
    private static final String PATH_FILE_B =
            "src/main/resources/fileB.txt";

    public static void main(String[] args)
    {
        try {
            ArrayList<String> stringsA = readFile(PATH_FILE_A);
            ArrayList<String> stringsB = readFile(PATH_FILE_B);
            writeArrayToFile(PATH_FILE_A, stringsB);
            writeArrayToFile(PATH_FILE_B, stringsA);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<String> readFile(String fileName) throws IOException
    {
        ArrayList<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                strings.add(reader.readLine());
            }
        }
        return strings;
    }

    public static void writeArrayToFile(String fileName, ArrayList<String> strings)
            throws IOException
    {
        try (PrintWriter writer = new PrintWriter( fileName)) {
            for (String string : strings) {
                writer.println(string);
            }
        }
    }

}
