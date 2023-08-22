import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        String Username = "Admin";
        String Password = "Password";
        String inputName;
        String inputPass;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        inputName = input.nextLine();
        System.out.print("Enter Password: ");
        inputPass = input.nextLine();

        System.out.println(inputName.equals(Username) && inputPass.equals(Password) ? "Welcome..." : "ACCESS DENIED!");
    }
}
