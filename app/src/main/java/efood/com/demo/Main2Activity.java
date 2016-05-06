package efood.com.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // nhan vao   lay
        Intent intent =getIntent();
         TextView texxt =(TextView)findViewById(R.id.texxt);
        texxt.setText(intent.getStringExtra("name"));
    }
}
