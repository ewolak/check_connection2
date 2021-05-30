import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class CheckConnection{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Nazwa bazy danych : ");
        String db = sc.nextLine();

        System.out.println(" Uzytkownik : ");
        String user = sc.nextLine();

        System.out.println(" Haslo : ");
        String password = sc.nextLine();

        System.out.println(" Adres : ");
        String host = sc.nextLine();

        System.out.println(" Port : ");
        String port = sc.nextLine();
        sc.close();

        String jdbcURL = "jdbc:postgresql://" + host + ":" + port + "/" + db;

        try {
            Connection  connection = java.sql.DriverManager.getConnection(jdbcURL, user, password);
            System.out.println("Connected");
            connection.close();
        } catch (SQLException e){
            System.out.println("no connection");
            e.printStackTrace();
        }
    }
}