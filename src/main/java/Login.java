import java.util.Scanner;

public class Login {

    private String username;
    private String password;
    private String cellNumber;
    private String firstName;
    private String lastName;

    
    
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // PASSWORD VALIDATION (BOOLEAN)
    
    public boolean checkPasswordComplexity(String password) {

        if (password.length() < 8) return false;

        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isDigit(c)) hasNumber = true;
            if (!Character.isLetterOrDigit(c)) hasSpecial = true;
        }

        return hasUpper && hasNumber && hasSpecial;
    }

    // CELL NUMBER VALIDATION 
   
    public boolean checkCellPhoneNumber(String number) {
        return number.matches("^\\+27\\d{9}$");
    }

    // REGISTER USER (STRING MESSAGE)
   
    public String registerUser(String username, String password, String cellNumber) {

        if (!checkUserName(username)) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }

        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

        if (!checkCellPhoneNumber(cellNumber)) {
            return "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.";
        }

        // Save details
        this.username = username;
        this.password = password;
        this.cellNumber = cellNumber;

        return "User has been registered successfully.";
    }

    
    // BOOLEAN FOR LOGIN CHECK
    
    public boolean loginUser(String username, String password) {
        return username.equals(this.username) && password.equals(this.password);
    }
    
    // LOGIN STATUS MESSAGE 
    
    public String returnLoginStatus(String username, String password) {

        if (loginUser(username, password)) {
            return "Welcome " + firstName + ", " + lastName + " it is great to see you.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
    
    
    public boolean startSystem() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        firstName = input.nextLine();

        System.out.print("Enter last name: ");
        lastName = input.nextLine();

        System.out.print("Enter username: ");
        String user = input.nextLine();

        if (checkUserName(user)) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted.");
        }

        System.out.print("Enter password: ");
        String pass = input.nextLine();

        if (checkPasswordComplexity(pass)) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted.");
        }

        System.out.print("Enter cell number: ");
        String cell = input.nextLine();

        if (checkCellPhoneNumber(cell)) {
            System.out.println("Cell number successfully captured.");
        } else {
            System.out.println("Cell number is incorrect.");
        }

        String regMessage = registerUser(user, pass, cell);
        System.out.println(regMessage);

        if (regMessage.equals("User has been registered successfully.")) {

            System.out.println("\n=== LOGIN ===");

            System.out.print("Enter username: ");
            String loginUser = input.nextLine();

            System.out.print("Enter password: ");
            String loginPass = input.nextLine();

            System.out.println(returnLoginStatus(loginUser, loginPass));

            return loginUser(loginUser, loginPass);
        }

        return false;
    }
}