package main.screen.data_access_layer;

import main.screen.pojo.NumberPojo;
import main.screen.view.InsertNumberApiManagerInterface;
import main.screen.view.InsertNumberInteractorInterface;
import main.screen.view.InsertNumberPresenterInterface;

/**
 * Created by Mayada on 7/19/2018.
 */

public class InsertNumberInteractor implements InsertNumberInteractorInterface {

    private InsertNumberPresenterInterface myPresenter;
    private InsertNumberApiManagerInterface myApi;

    public InsertNumberInteractor(InsertNumberPresenterInterface presenter) {
        this.myPresenter = presenter;
        initInteractor();
    }

    @Override
    public void initInteractor(){
        myApi=new InsertNumberApiManager(this);
    }

    @Override
    public void sendNumberInteractor(NumberPojo numberPojo) {
        myApi.receiveInsertedNumber(numberPojo);
    }

    @Override
    public void recieveInsertionResponseInteractor(Boolean status) {
        myPresenter.recieveNumberResponsePresenter(status);
    }
}
