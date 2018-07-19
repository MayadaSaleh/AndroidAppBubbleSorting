package show.numbers.screen.data_access_layer;

import java.util.List;

import main.screen.pojo.NumberPojo;
import show.numbers.screen.view.ShowNumbersApiManagerInterface;
import show.numbers.screen.view.ShowNumbersInteractorInterface;
import show.numbers.screen.view.ShowNumbersPresenterInterface;

/**
 * Created by Mayada on 7/19/2018.
 */

public class ShowNumbersInteractor implements ShowNumbersInteractorInterface{
    private ShowNumbersPresenterInterface myPresenter;
    private ShowNumbersApiManagerInterface myApi;

    public ShowNumbersInteractor(ShowNumbersPresenterInterface presenter) {
        this.myPresenter = presenter;
        initInteractor();
    }

    @Override

    public void initInteractor(){
        myApi=new ShowNumbersApiManager(this);
    }
    @Override
    public void getPojosInteractor() {
        myApi.getPojosAPIManager();
    }

    @Override
    public void recieveResponseInteractor(List<NumberPojo> pojos) {
        myPresenter.recieveResponsePresenter(pojos);
    }
}
