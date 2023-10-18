import models.User;
import ui.Validator;

import java.util.List;

public class UsernameValidator implements Validator {

    protected Validator nextValidator;
    private List<User> users;

    public void setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }


    public UsernameValidator(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean validate(User user) {
        for (User existingUser : users) {
            if (existingUser.getUsername().equals(user.getUsername())) {
                return true;
            }
        }
        System.out.println("User not found.");
        return false;
    }
}

