package ru.itsjava.homework;

// HW:
// 1. Объект класса User (login, password). поставить transient на password

public class HomeWorkRunner {
    public final String filename = "user.out";

    public static void main(String[] args) {

    }

    public static void serializeUser(User user) {

    }

    //public static User deserializeUser() {

    //}

    public static class User {
        private String login;
        private transient String password;

        public User(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
