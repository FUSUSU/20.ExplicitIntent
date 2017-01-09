package com.example.teo.a20explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    /** Called when the activity is the created.*/
    //Được gọi đầu tiên khi gọi tạo mới
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                i.putExtra("Value1","Android By Javatpont");
                i.putExtra("Value2","Simple Tutorial");
                //Set the request code to any code you like, you can identify class call via this code
                //Đặt mã yêu cầu cho bất kí mã nào mà bạn thích, bạn có thể nhận gọi thông qua <code></code>
                startActivity(i);
            }
        });
    }
}
