package ru.spb.aog.iostreams.text_memorizator;

// 4. Написать свою запоминалку текста.
// Пользователь вводит имя файла и путь к нему.
// Затем вводит несколько предложений и они сохраняются в файле по выбранному пути.

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TextMemorizator implements Serializable {
    private ArrayList<String> strings;
    private String fileName;

    public static void main(String[] args) throws IOException {

        TextMemorizator textMemorizator = new TextMemorizator();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // ввод полного имени файла
        textMemorizator.inputPath(reader);

        // если файл есть - считываем строки, если файла нет - создаем его
        textMemorizator.readStringsOrCreateFile();

        textMemorizator.printStrings(); // вывод строк для проверки

        // ввод новых строк
        textMemorizator.inputStrings(reader);

        // сохраняем все строки: старые (если есть) и новые
        textMemorizator.saveStrings();
    }


    public TextMemorizator() {
        strings = new ArrayList<>();
    }

    public void printStrings() {
        System.out.println("Наши строки: (" + strings.size() + ")");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public void inputPath(BufferedReader reader) {
        try {
            System.out.print("Введите имя файла: ");
            fileName = reader.readLine();
            if (fileName.equals("")) {
                System.exit(-1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readStringsOrCreateFile() throws IOException {
        if (Files.exists(Paths.get(fileName))) {
            readStrings();
        } else {
            createFile();
        }
    }

    private void createFile() throws IOException {
        Files.createFile(Paths.get(fileName));
    }

    public void inputStrings(BufferedReader reader) throws IOException {
        System.out.println("Введите строки (пустая строка для окончания ввода):");
        String newString;
        while (!(newString = reader.readLine()).equals("")) {
            strings.add(newString);
        }
    }

    public void saveStrings() {
        if (strings.isEmpty()) return;
        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream
                             (Files.newOutputStream(Paths.get(fileName)))) {
            outputStream.writeObject(strings);
            System.out.println("Строки были сохранены в файле: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readStrings() {
        try (ObjectInputStream inputStream =
                     new ObjectInputStream
                             (Files.newInputStream(Paths.get(fileName)))) {
            strings = (ArrayList<String>) inputStream.readObject();
            System.out.println("Прочитано строк: " + strings.size());
        } catch (EOFException e) {
            System.out.println("В файле нет строк!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Невозможно прочитать строки из файла: " + fileName);
            e.printStackTrace();
        }
    }

}
