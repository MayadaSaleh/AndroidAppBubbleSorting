package show.numbers.screen.view;

import java.util.List;

import main.screen.pojo.NumberPojo;

/**
 * Created by Mayada on 7/19/2018.
 */

public interface ShowNumbersPresenterInterface {
    void getPojos();
    void recieveResponsePresenter (List<NumberPojo> pojos);
}
