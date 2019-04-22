import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads{

    private List<Ad> ads = new ArrayList<>();
    private Connection connection;

    @Override
    public Long insert(Ad ad) {
        Long newAdId = -1L;

        String query = String.format("INSERT INTO ads(user_id, title, description) VALUES('%s', '%s', '%s')",
            ad.getUserId(),
            ad.getTitle(),
            ad.getDescription());

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                System.out.println("Inserted a new record: New ID: " +rs.getLong(1));
                newAdId = rs.getLong(1);
            }
        }catch(SQLException e){
            System.out.println("Problem connecting to database for adding new ad.");
            System.out.println(e);
        }
    return newAdId;
    }

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        }catch(SQLException e) {
            System.out.println(e);
        }
    }

    public  List<Ad> all() {

        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");


            while(rs.next()){
                ads.add(
                        new Ad(
                            rs.getLong("id"),
                            rs.getLong("user_id"),
                            rs.getString("title"),
                            rs.getString("description")
                        )
                );
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        return ads;
    }

    public static void main(String[] args) {

//            MySQLAdsDao dao = new MySQLAdsDao(new Config());
//            dao.insert(new Ad(1,"JDBC Ad", "ad created in Java"));
//            for(Ad ad : dao.all()) {
//                System.out.println(ad.getTitle());
//            }

    }
}
