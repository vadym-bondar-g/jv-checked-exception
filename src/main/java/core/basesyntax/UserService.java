package core.basesyntax;

public class UserService {
    private PasswordValidator passwordValidator = new PasswordValidator();
    public void registerUser(User user) {
        //write your code here
        try {
            passwordValidator.validate(user.getPassword(), user.getRepeatPassword());
        } catch (PasswordValidationException e) {
            System.out.println(e.getMessage());
        }
        saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
