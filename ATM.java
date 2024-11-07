/**
 * The ATM class represents the main entry point of the ATM application.
 * It inherits from the {@link OptionMenu} class, which contains the core
 * functionalities for user login and transaction options.
 */
public class ATM extends OptionMenu {

    /**
     * The main method, which starts the ATM application.
     * This initializes an instance of {@link OptionMenu} and begins
     * the login process for the user.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        OptionMenu options = new OptionMenu();
        
        // Initiates the login process for the ATM
        options.getLogin();
    }
}
