package com.example.assignment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private  int number;

    TextView receiver_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        receiver_msg = findViewById(R.id.received_value_id);
        Intent intent = getIntent();
        number = intent.getIntExtra("message_key",0);
        receiver_msg.setText(number+"");



    }
    @Override
    public void onBackPressed()  {

        int doubleNum = number*2;
        Intent intent1 = new Intent();
//        String num = intent1.getStringExtra("message_key");
//        System.out.println(num);

//        if (num == null) {
//            finish();
//        }
//        else{
//            int  new_num =  Integer.parseInt(num);
//            int  new_num =  Integer.parseInt(num);
        intent1.putExtra("result", doubleNum);
        setResult(RESULT_OK, intent1);
        finish();
//        }

    }
}