import models.Admin;
import models.Client;
import models.User;
import ui.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<User> users = new ArrayList<>();
        users.add(new Client("user1", "password"));
        users.add(new Admin("admin1", "passworda"));

        Validator usernameValidator = new UsernameValidator(users);
        Validator passwordValidator = new PasswordValidator(users);
        Validator roleValidator = new RoleValidator(users);

        usernameValidator.setNextValidator(passwordValidator);
        passwordValidator.setNextValidator(roleValidator);

        String username;
        String password;
        int role;


        System.out.println("Ingrese usuario");
        username= leer.next();
        System.out.println("Ingrese Contraseña");
        password= leer.next();
        System.out.println("Ingrese Rol, 1 para Client y  2 para Admin");
        role= leer.nextInt();

        User user;
        if (role == 2) {
            user = new Admin(username, password);
        } else if (role == 1) {
            user = new Client(username, password);
        } else {
            System.out.println("Login failed.");
            return;
        }

        if (roleValidator.validate(user) && usernameValidator.validate(user) && passwordValidator.validate(user)) {
            System.out.println("Login successful");
            if (user instanceof Admin) {
                System.out.println("Welcome, Administrator.");
            } else if (user instanceof Client) {
                System.out.println("Welcome, Client.");
            }
        } else {
            System.out.println("Login failed.");
        }

    }}




