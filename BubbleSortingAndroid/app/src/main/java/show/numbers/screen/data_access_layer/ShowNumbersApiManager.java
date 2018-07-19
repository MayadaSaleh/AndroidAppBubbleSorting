package show.numbers.screen.data_access_layer;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import show.numbers.screen.control.ApiRetrofitUtils;
import main.screen.pojo.NumberPojo;
import main.screen.pojo.ResultResponse;
import show.numbers.screen.view.ShowNumbersApiManagerInterface;
import show.numbers.screen.view.ShowNumbersInteractorInterface;

/**
 * Created by Mayada on 7/19/2018.
 */

public class ShowNumbersApiManager implements ShowNumbersApiManagerInterface{

    private ShowNumbersInteractorInterface myInteractor;
    List<NumberPojo> numbers;

    public ShowNumbersApiManager(ShowNumbersInteractorInterface interactor) {
        this.myInteractor = interactor;
    }
    @Override
    public void getPojosAPIManager() {
        Call<List<NumberPojo>> responseCall = ApiRetrofitUtils.getService().getPojos();
        responseCall.enqueue(new Callback<List<NumberPojo>>() {
            @Override
            public void onResponse(Call<List<NumberPojo>> call, Response<List<NumberPojo>> response) {
                numbers = response.body();
                myInteractor.recieveResponseInteractor(numbers);
            }

            @Override
            public void onFailure(Call<List<NumberPojo>> call, Throwable t) {
                Log.i("failure",t.getMessage());
                myInteractor.recieveResponseInteractor(numbers);
            }
        });
    }
}
