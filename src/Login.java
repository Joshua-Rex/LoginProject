public class Login {
    // First set = Usernames | Second set = Passwords
    // Username = Admin | Password = Password
    private String[][] accounts = { {"Admin", "password"}, {"Ash", "pikachu"}, {"Link", "zelda"}, {"Mario", "peach"}, {"Katarina", "garen"} };

    // Checks the username entered by the user and checks if it exists in the account
    // If it does, it returns the password to that account for the password check
    // If the account does not exist, returns null
    public String UsernameCheck(String userInput) {
        for (String[] account : accounts) {
            if (account[0].equals(userInput)) {
                return account[1];
            }
        }
        return null;
    }

    // Checks the password entered and the information the user passed through
    // If they equal the same, returns true, otherwise returns false
    public boolean PasswordCheck(String accountPass, String userInput) {
        if (accountPass.equals(userInput.toLowerCase())) {
            return true;
        }
        return false;
    }
}
