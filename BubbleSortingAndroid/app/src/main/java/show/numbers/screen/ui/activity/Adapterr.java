package show.numbers.screen.ui.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mayada.bubblesortingandroid.R;

import java.util.List;

import main.screen.pojo.NumberPojo;

/**
 * Created by Mayada on 2/24/2018.
 */

public class Adapterr extends ArrayAdapter<NumberPojo> {

    List<NumberPojo> numberPojos;
    Context context1;
    public Adapterr(Context context, int resource, int textViewResourceId, List<NumberPojo> objects) {
        super(context, resource, textViewResourceId, objects);
        numberPojos=objects;
         context1=context;
    }


    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
   View row;
        LayoutInflater inf= (LayoutInflater) context1.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        row=inf.inflate(R.layout.custom,parent,false);
        TextView number=row.findViewById(R.id.Number);
        TextView numberID=row.findViewById(R.id.NumberID);
        number.setText("Number"+numberPojos.get(position).getNumber());
        numberID.setText("   ID"+numberPojos.get(position).getId());

        return row;
    }
}
