package show.numbers.screen.control;

import java.util.List;

import main.screen.pojo.NumberPojo;
import main.screen.pojo.ResultResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by Mayada on 7/19/2018.
 */

public interface ShowNumbersServiceRetrofit {

    @GET("bubblesortingnumber/")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call <List<NumberPojo>> getPojos ();
}
