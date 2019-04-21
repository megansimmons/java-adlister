import com.mysql.cj.jdbc.Driver;
import java.sql.*;


public class JDBCTest {

    public static void main(String [] args){

        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false",
                    "adlistuser",
                    "password1234"
            );
            Statement stmt = connection.createStatement();
            //now we can run sql commands using execute methods

            //variable types from mySQL have to be converted to comparable types in java
            //do not need to include the auto_increment id value becuase it will generate on its own

            //wasn't allowed access as user 'root'@'localhost' -->no password associated with root so not sure if that's the problem
            String username = "kkmarie";
            String email = "kkmarie987@gmail.com";
            String password = "kkpassword";

            stmt.executeUpdate("INSERT INTO users(username, email, password) values('"+username+"', '"+email+"', '"+password+"')");
            //could aslo do the same thing with the following
            stmt.executeUpdate(String.format("INSERT INTO users(username, email, password,) values('%s', '%s', '%s')", username, email, password));


            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            //use .next() to move cursor through results row by row, will return true as long as more
            while(rs.next()){
                //now we can include the id if we want to see it printed out
                System.out.println("id in table " + rs.getInt("id"));
                System.out.println("username " + rs.getString("username"));
                System.out.println("email " + rs.getString("email"));
                System.out.println("password is kept secret");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
