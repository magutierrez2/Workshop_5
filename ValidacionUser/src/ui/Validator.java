
package ui;

import models.User;

public interface Validator {

    void setNextValidator(Validator nextValidator);


    boolean validate(User user);

}
