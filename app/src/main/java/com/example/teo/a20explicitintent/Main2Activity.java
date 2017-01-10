package com.example.teo.a20explicitintent;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("second activity");
        setContentView(R.layout.activity_main2);

        //Bundle giống như string nhưng có nhiều phương thức hỗ trợ hơn
        //Cái này đùng để lấy dữ liệu trong intent
        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value1");
        String value2 = extras.getString("Value2");
        Toast.makeText(getApplicationContext(), "Value are:\n First value: "+value1+"\n Second Value: "+value2, Toast.LENGTH_LONG).show();
    }
}
