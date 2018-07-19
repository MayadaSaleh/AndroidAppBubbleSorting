package main.screen.view;

import main.screen.pojo.NumberPojo;

/**
 * Created by Mayada on 7/19/2018.
 */

public interface InsertNumberPresenterInterface {
    void sendNumberPresenter(NumberPojo numberPojo);
    void recieveNumberResponsePresenter (Boolean status);
}
