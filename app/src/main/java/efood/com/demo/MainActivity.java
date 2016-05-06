package efood.com.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import efood.com.demo.Adapter.StudentAdapter;
import efood.com.demo.Model.Car;

public class MainActivity extends AppCompatActivity {
    // cacs bien cuc bo
    ListView listview;
    ArrayList<Car> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.listview);
        list = new ArrayList<>();
        Car car = new Car();
        car.setName("nguyen");
        list.add(car);
        car = new Car();
        car.setName("loc");
        list.add(car);
        // tạo mơi mot doi tuong
        car = new Car();
        car.setName("bac");
        list.add(car);
        StudentAdapter studentAdapter = new StudentAdapter(list);
        listview.setAdapter(studentAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Car car = list.get(position);
                    String st =car.getName();
                Intent intent  =new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("name",st);
                startActivity(intent);
            }
        });

    }
}
