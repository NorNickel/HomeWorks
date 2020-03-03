package ru.itsjava.iostreams.serializing;

// 1. Объект класса User (login, password) Проставить transient на password.
// Сериализовать объект. После десериализовать объект и вывести поля login и password.

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UserSerializerDeserializerRunner {

    public static final String FILE_NAME_FOR_SERIALIZE_USER =
            "src/main/java/ru/itsjava/iostreams/serializing/user.out";

    public static void main(String[] args) {
        // 1. Сериализация / десериализация объекта User
        User user = new User("Andrey", "12345");
        System.out.println("user = " + user);

        serializeUser(user);

        User deserializedUser = deserializeUser();
        System.out.println("deserializedUser = " + deserializedUser);
    }

    public static void serializeUser(User user) {
        try {
            serializeUser(user, Paths.get(FILE_NAME_FOR_SERIALIZE_USER));
        } catch (IOException e) {
            System.out.println("Невозможно сериализовать объект User");
            System.exit(-1);
        }
    }

    private static void serializeUser (User user, Path file) throws IOException {
        if (!Files.exists(file)) {
            Files.createFile(file);
        }
        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(Files.newOutputStream(file)))
        {
            outputStream.writeObject(user);
            System.out.println("Объект успешно сериализован и сохранен в файл: "
                    + file.getFileName());
        }
    }

    public static User deserializeUser() {
        try {
            return deserializeUser(Paths.get(FILE_NAME_FOR_SERIALIZE_USER));
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Невозможно десериализовать объект User");
            return null;
        }
    }

    private static User deserializeUser(Path file) throws IOException, ClassNotFoundException {
        if (!Files.exists(file)) {
            System.out.println("Не найден файл: " + file.getFileName());
            return null;
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(file))) {
            return (User) inputStream.readObject();
        }
    }
}
