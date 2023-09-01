import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class LoginTest {
    Login l = new Login();

    // If the wrong username is entered, then the string null is returned
    // In actual application, loop is only broken once the string is no longer null
    // E.G. When the user enters a valid username
    @Test
    public void WrongUsernameEqualsNull() {
        assertNull(l.UsernameCheck("wrongUser"));
    }

    // If the wrong password is entered, then the function returns false
    // In actual application, password loop is broken after 3 failed password attempts
    // or when the method returns true
    @Test
    public void WrongPasswordEqualsFalse() {
        assertFalse(l.PasswordCheck("password", "wrongPass"));
    }

    // When a correct username is entered, the password for that username is returned
    // This is used later during the password check.
    // In this test, it checks if the password is returned after the correct username is entered
    @Test
    public void CorrectUsernameEqualsPassword() {
        assertEquals("password", l.UsernameCheck("Admin"));
    }

    // If the correct password is entered, the method returns true
    // In actual application, this breaks the password loop and logs the user
    // into the program. Here it checks that if the account password is equal to
    // the user inputted password, the method returns true
    @Test
    public void CorrectPasswordEqualsTrue() {
        assertTrue(l.PasswordCheck("password", "password"));
    }

    // This test is a mixture of the methods above, testing that if the correct
    // username is entered and then the incorrect password, the function will still
    // return false.
    @Test
    public void CorrectUsernameWrongPasswordEqualsFalse() {
        String accountPass;
        accountPass = l.UsernameCheck("Admin");
        assertFalse(l.PasswordCheck(accountPass, "wrongPass"));
    }

    // This test makes sure that if the user enters the correct username and password
    // the method returns true and logs the user into the account.
    @Test
    public void CorrectUsernameCorrectPasswordEqualTrue() {
        String accountPass;
        accountPass = l.UsernameCheck("Admin");
        assertTrue(l.PasswordCheck(accountPass, "password"));
    }

}