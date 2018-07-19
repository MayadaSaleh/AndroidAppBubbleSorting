package show.numbers.screen.presenter;

import java.util.ArrayList;
import java.util.List;

import main.screen.pojo.NumberPojo;
import show.numbers.screen.data_access_layer.ShowNumbersInteractor;
import show.numbers.screen.view.ShowNumbersInteractorInterface;
import show.numbers.screen.view.ShowNumbersPresenterInterface;
import show.numbers.screen.view.ShowNumbersViewInterface;

/**
 * Created by Mayada on 7/19/2018.
 */

public class ShowNumbersPresenter implements ShowNumbersPresenterInterface {

    private ShowNumbersViewInterface showNumberNumberActivity;
    private ShowNumbersInteractorInterface interactorObject;

    public ShowNumbersPresenter(ShowNumbersViewInterface myView) {
        this.showNumberNumberActivity = myView;
        initPresenter();
    }

    void initPresenter()

    {
        interactorObject=new ShowNumbersInteractor(this);
        showNumberNumberActivity.initView();
    }

    @Override
    public void getPojos() {
        interactorObject.getPojosInteractor();
    }

    @Override
    public void recieveResponsePresenter(List<NumberPojo> pojos) {
        showNumberNumberActivity.showResponseView(pojos);
    }
}
