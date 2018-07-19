package show.numbers.screen.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.mayada.bubblesortingandroid.R;

import java.util.List;

import butterknife.ButterKnife;
import main.screen.pojo.NumberPojo;
import show.numbers.screen.presenter.ShowNumbersPresenter;
import show.numbers.screen.view.ShowNumbersPresenterInterface;
import show.numbers.screen.view.ShowNumbersViewInterface;

public class ShowNumbersActivity extends Activity implements ShowNumbersViewInterface{

    ShowNumbersPresenterInterface showPresnter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_numbers);
        showPresnter = new ShowNumbersPresenter(this);
        showPresnter.getPojos();
    }

    @Override
    public void initView() {
        ButterKnife.bind(this);
    }
    @Override
    public void showResponseView(List<NumberPojo> pojos) {
        if(pojos != null){
            Adapterr myAdapter=new Adapterr(this,R.layout.custom,R.id.Number,pojos);
            ListView list=findViewById(R.id.myList);
            list.setAdapter(myAdapter);
        }
    }
}
