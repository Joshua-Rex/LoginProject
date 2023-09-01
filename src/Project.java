import java.util.Scanner;

public class Project {
    public static void main(String[] args) {


        // Scanner for collecting inputs
        Scanner input = new Scanner(System.in);
        Login l = new Login();
        // inputDetails stores the answer from the user, passHolder stores the password associated with the username
        String inputDetails;
        String passHolder;

        // breakOut confirms if the user entered a corrected username and password
        boolean breakOut = false;

        // Forces the user to enter a username that is currently stored in the array
        // Also stores the password for the account for the next loop
        do {
            System.out.print("Enter username: ");
            inputDetails = input.nextLine();
            passHolder = l.UsernameCheck(inputDetails);
//            for (String[] account : accounts) {
//                if (account[0].equals(inputDetails)) {
//                    breakOut = true;
//                    passHolder = account[1];
//                    break;
//                }
//            }
        } while (passHolder == null);

        // Gives the user 3 tries to correctly get the password for the account
        // If the user is successful, breaks out the loop and lets the user in
        // If the user is unsuccessful, ends the loop naturally and locks the user out
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Password: ");
            inputDetails = input.nextLine();
            breakOut = l.PasswordCheck(passHolder, inputDetails);
            if (breakOut)
                break;
        }

        System.out.println(breakOut ? "Welcome..." : "ACCESS DENIED!");
    }
}
