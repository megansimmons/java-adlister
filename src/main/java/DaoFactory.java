public class DaoFactory {

    private static Ads adsDao;
    private static Dogs dogsDao;


    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }

    public static Dogs getDogsDao(){
        if(dogsDao == null) {
            dogsDao = new ListDogsDao();
        }
        return dogsDao;
    }


}
