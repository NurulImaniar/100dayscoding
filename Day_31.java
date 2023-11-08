package Day_31;
import java.util.Scanner;
public class Day_31 {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        String username, password;
        String correctUsername = "Nurul Imaniar";
        String correctPassword = "doy_960201";

        do {
            System.out.print("Username: ");
            username = login.nextLine();

            System.out.print("Password: ");
            password = login.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println(username + " kamu telah berhasil login");
                break;
            } else {
                System.out.println("Username dan Password anda salah!");
            }
        } while (true);
    }


    }
