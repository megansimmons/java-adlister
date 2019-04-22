import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;
    //instantiate new mysqladsdao
    //with new config
    public static Ads getAdsDao() {
        if (adsDao == null) {

            adsDao = new MySQLAdsDao(new Config());
        }
        return adsDao;
    }
}
