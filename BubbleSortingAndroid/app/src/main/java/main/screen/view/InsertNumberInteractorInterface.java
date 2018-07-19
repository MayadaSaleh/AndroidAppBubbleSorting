package main.screen.view;

import main.screen.pojo.NumberPojo;

/**
 * Created by Mayada on 7/19/2018.
 */

public interface InsertNumberInteractorInterface {
    void initInteractor();
    void sendNumberInteractor(NumberPojo numberPojo);
    void recieveInsertionResponseInteractor(Boolean status);
}
