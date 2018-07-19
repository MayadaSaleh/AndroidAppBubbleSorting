package main.screen.ui.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mayada.bubblesortingandroid.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import main.screen.pojo.NumberPojo;
import main.screen.presenter.InsertNumberPresenter;
import main.screen.view.InsertNumberPresenterInterface;
import main.screen.view.InsertNumberViewInterface;
import show.numbers.screen.ui.activity.ShowNumbersActivity;

public class InsertNumberActivity extends Activity implements InsertNumberViewInterface {

    @BindView(R.id.insertedNumber)
    EditText insertedNumber;
    private Integer number;
    private NumberPojo numberPojo = new NumberPojo();
    InsertNumberPresenterInterface insertpresenterInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_number);
        insertpresenterInterface = new InsertNumberPresenter(this);
    }

    @Override
    public void initView() {
        ButterKnife.bind(this);
    }

    @Override
    public void recieveInsertionResponseView(Boolean status) {
        if(status==true){
            Toast.makeText(this,getApplicationContext().getResources().getString(R.string.InsertionDone)
                    , Toast.LENGTH_LONG).show();
        }else {
            AlertDialog alertDialog = new AlertDialog.Builder(InsertNumberActivity.this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage(getApplicationContext().getResources().getString(R.string.InsertionFailed));
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        }
        }

    @OnClick(R.id.insertNewNumber)
    public void insertNumber () {
        number = Integer.parseInt(insertedNumber.getText().toString().trim());
        if (number == null) {
            AlertDialog alertDialog = new AlertDialog.Builder(InsertNumberActivity.this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage(getApplicationContext().getResources().getString(R.string.EmptyFieldWarning));
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        }else{
            numberPojo.setNumber(number);
            insertpresenterInterface.sendNumberPresenter(numberPojo);
        }
    }

    @OnClick(R.id.showNumbers)
    public void goToSecondActivity () {
        Intent showActivity = new Intent(InsertNumberActivity.this,ShowNumbersActivity.class);
        startActivity(showActivity);
    }

}
