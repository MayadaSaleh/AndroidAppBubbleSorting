package main.screen.control;

import main.screen.pojo.NumberPojo;
import main.screen.pojo.ResultResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Mayada on 7/19/2018.
 */

public interface InsertRandomNumberServiceRetrofit {

    @POST("bubblesortingnumber/")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call<ResultResponse> addNumber (@Body NumberPojo numberPojo);
}
