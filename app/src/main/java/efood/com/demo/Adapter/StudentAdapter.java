package efood.com.demo.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import efood.com.demo.Model.Car;
import efood.com.demo.R;

/**
 * Created by loc on 06/05/2016.
 */

public class StudentAdapter extends BaseAdapter {

    //  ArrayList<string >list;  vi tri la string
    ArrayList<Car> list;// tuc la moi vi tri la string

    // cunstruster  hamf khoi tao
    public StudentAdapter(ArrayList<Car> list) {
        // a= b
//        StudentAdapter.this.list =list;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // thuwhc hien goi layout custom
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        // goi text tu custom acti
        TextView txt = (TextView) view.findViewById(R.id.txt);
        //
        Car car = list.get(position);
        /*
        *  toi muon hien ten len cau text
        * */
        txt.setText(car.getName());
        return view;
    }
}
