package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        //Создаем таблицу
        userService.createUsersTable();

        //Добавление 4 User(ов) в таблицу
        userService.saveUser("Lupa", "Lupova", (byte) 26);
        userService.saveUser("Pupa", "Pupova", (byte) 27);
        userService.saveUser("Accountant", "Which-messed-everything-up", (byte) 40);
        userService.saveUser("Mr.", "Boss", (byte) 35);

        // Получение всех User-ов из базы и вывод в консоль
        System.out.println(userService.getAllUsers());

        // Очистка таблицы User(ов)
        userService.cleanUsersTable();

        // Удаление таблицы
        userService.dropUsersTable();
    }
}
