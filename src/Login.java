public class Login {
    // First set = Usernames | Second set = Passwords
    // Username = Admin | Password = Password
    private String[][] accounts = { {"Admin", "password"}, {"Ash", "pikachu"}, {"Link", "zelda"}, {"Mario", "peach"}, {"Katarina", "garen"} };
    public String UsernameCheck(String userInput) {
        for (String[] account : accounts) {
            if (account[0].equals(userInput)) {
                return account[1];
            }
        }
        return null;
    }

    public boolean PasswordCheck(String accountPass, String userInput) {
        if (accountPass.equals(userInput.toLowerCase())) {
            return true;
        }
        return false;
    }
}
