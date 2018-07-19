package main.screen.data_access_layer;

import android.util.Log;

import main.screen.control.APIRetrofitUtils;
import main.screen.pojo.NumberPojo;
import main.screen.pojo.ResultResponse;
import main.screen.view.InsertNumberApiManagerInterface;
import main.screen.view.InsertNumberInteractorInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import show.numbers.screen.control.ApiRetrofitUtils;

/**
 * Created by Mayada on 7/19/2018.
 */

public class InsertNumberApiManager implements InsertNumberApiManagerInterface {

    private InsertNumberInteractorInterface myInteractor;
    Boolean returnResponseStatus=false;

    public InsertNumberApiManager(InsertNumberInteractorInterface interactor) {
        this.myInteractor = interactor;
    }

    @Override
    public void receiveInsertedNumber(NumberPojo numberPojo) {
        Call<ResultResponse> responseCall = APIRetrofitUtils.getService().addNumber(numberPojo);
        responseCall.enqueue(new Callback<ResultResponse>() {
            @Override
            public void onResponse(Call<ResultResponse> call, Response<ResultResponse> response) {
                ResultResponse responseReturn = response.body();
                Log.i("result",responseReturn.getMessage().toString());
                returnResponseStatus=responseReturn.isStatus();
                myInteractor.recieveInsertionResponseInteractor(returnResponseStatus);
            }

            @Override
            public void onFailure(Call<ResultResponse> call, Throwable t) {
                Log.i("failure",t.getMessage());
                returnResponseStatus=false;
                myInteractor.recieveInsertionResponseInteractor(returnResponseStatus);
            }
        });
    }
}
