package show.numbers.screen.view;

import java.util.List;

import main.screen.pojo.NumberPojo;

/**
 * Created by Mayada on 7/19/2018.
 */

public interface ShowNumbersViewInterface {
    void initView();
    void showResponseView(List<NumberPojo> pojos);

}
