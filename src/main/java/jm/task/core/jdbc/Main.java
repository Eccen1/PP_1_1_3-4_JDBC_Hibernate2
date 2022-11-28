package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

public class Main {
    public static void main(String[] args) {

        UserDao user = new UserDaoHibernateImpl();

        user.createUsersTable();

        user.saveUser("Ivan", "Ivanov", (byte) 18);
        user.saveUser("Petr", "Petrov", (byte) 18);
        user.saveUser("Anton", "Smirnov", (byte) 18);
        user.saveUser("Sergey", "Popov", (byte) 18);

        System.out.println(user.getAllUsers());

        user.cleanUsersTable();
        user.dropUsersTable();
    }
}