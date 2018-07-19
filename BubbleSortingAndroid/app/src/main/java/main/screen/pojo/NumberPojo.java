package main.screen.pojo;

import java.io.Serializable;

/**
 * Created by Mayada on 7/19/2018.
 */

public class NumberPojo implements Serializable {

    private int id;
    private int number;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
