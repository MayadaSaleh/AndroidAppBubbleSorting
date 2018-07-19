package main.screen.pojo;

import java.io.Serializable;

/**
 * Created by Mayada on 7/19/2018.
 */

public class ResultResponse implements Serializable {

    private boolean status;
    private String message;
    private int error;

    public boolean isStatus() {
        return status;
    }
    public String getMessage() {
        return message;
    }
    public int getError() {
        return error;
    }
}
