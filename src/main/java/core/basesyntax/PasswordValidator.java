package core.basesyntax;

public class PasswordValidator {

    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password.equals(repeatPassword)) {
            System.out.println("Passwords do match");
        } else {
            throw new PasswordValidationException("Passwords do not match");
        }
    }
}
