package show.numbers.screen.control;

/**
 * Created by Mayada on 7/19/2018.
 */

public class ApiRetrofitUtils {

    public static final String BASE_URL = "http://192.168.1.2:8080/BubbleSortAPI/api/rest/";
    public static ShowNumbersServiceRetrofit getService() {
        return RetrofitCreation.getClient(BASE_URL).create(ShowNumbersServiceRetrofit.class);

    }
}
