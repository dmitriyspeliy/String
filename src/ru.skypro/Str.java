package ru.skypro;

public class Str {


    public static void main(String[] args) {
        String firstName = "Dmitriy";
        String middleName = "Alexsandrovich";
        String lastName = "Pospelov";
        String fullName = String.format("%s %s %s\n", lastName, firstName, middleName);
        String exampleFullName = "Иванов Семён Семёнович";
        System.out.println(fullName);
        System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s\n", changeRegister(fullName));
        System.out.println(changeChar(exampleFullName));
    }


    //метод, изменяет регистр слова
    public static String changeRegister(String name) {
        return name.toUpperCase();
    }

    //метод, меняет букву ё на е в слове
    public static String changeChar(String name) {
        if (name.contains("ё")) {
            name = name.replaceAll("ё", "е");
        }
        return name;
    }
}
