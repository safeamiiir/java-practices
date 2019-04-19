package wonderport;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by amir on 4/9/17.
 */
public class Users {
    private String password;
    private String username;
    private String ppassword;
    private static int i = 1;
    private int id = 0;
    static int numberSelection;

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public int getId() {
        return id;
    }

    public void usernameAndPasswordSetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Set Your User Name : ");
        id = i++;
        username = scanner.next();
        System.out.println(" Set Your Password : ");
        password = scanner.next();
        System.out.println(" Set Your Password for second time : ");
        ppassword = scanner.next();
        while (!password.equalsIgnoreCase(ppassword)) {
            System.out.println(" The passwords don't match ! ");
            System.out.println(" Set Your Password again : ");
            password = scanner.next();
            System.out.println(" Set Your Password for second time  : ");
            ppassword = scanner.next();
        }
    }

}
