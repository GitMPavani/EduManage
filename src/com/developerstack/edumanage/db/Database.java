package com.developerstack.edumanage.db;

import com.developerstack.edumanage.model.Student;
import com.developerstack.edumanage.model.User;
import com.developerstack.edumanage.util.security.PasswordManager;

import java.util.ArrayList;

public class Database {
    public static ArrayList<User> userTable = new ArrayList<>();

    public static ArrayList<Student> studentTable = new ArrayList<>();

    static {
        userTable.add(
                new User("Tharaka", "Madarasinghe","tharaka@gmail.com",
                        new PasswordManager().encript("1234"))
        );
    }
}
