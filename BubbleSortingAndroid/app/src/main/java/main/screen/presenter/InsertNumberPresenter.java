package main.screen.presenter;

import main.screen.data_access_layer.InsertNumberInteractor;
import main.screen.pojo.NumberPojo;
import main.screen.view.InsertNumberInteractorInterface;
import main.screen.view.InsertNumberPresenterInterface;
import main.screen.view.InsertNumberViewInterface;

/**
 * Created by Mayada on 7/19/2018.
 */

public class InsertNumberPresenter implements InsertNumberPresenterInterface {

    private InsertNumberViewInterface insertNumberActivity;
    private InsertNumberInteractorInterface interactorObject;

    public InsertNumberPresenter(InsertNumberViewInterface myView) {
        this.insertNumberActivity = myView;
        initPresenter();
    }

    void initPresenter()
    {
        interactorObject=new InsertNumberInteractor(this);
        insertNumberActivity.initView();
    }

    @Override
    public void sendNumberPresenter(NumberPojo numberPojo) {
        interactorObject.sendNumberInteractor(numberPojo);
    }

    @Override
    public void recieveNumberResponsePresenter(Boolean status) {
        insertNumberActivity.recieveInsertionResponseView(status);
    }
}
