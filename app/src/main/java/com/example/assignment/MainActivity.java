package com.example.assignment;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int num;

    EditText send_number;
    Button send_button;


    TextView double_num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getting the ui id's content for attaching
        send_button = findViewById(R.id.send_button_id);
        send_number = findViewById(R.id.send_number_id);
        double_num = findViewById(R.id.received_new_value_id);

//        here we first add the listener which bound some action to button
        send_button.setOnClickListener(v -> {
            num = Integer.parseInt(send_number.getText().toString());
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            intent.putExtra("message_key", num);
            startActivity(intent);

        });

    }
//
//    String result = data.getStringExtra("result");
//          double_num.setText("Multiply BY 2:" + result);
//    as we knew that intent help to communication so we import number from activity_2 then we perform action on it then we add the text or set text
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

            String result = data.getStringExtra("result");
          double_num.setText("Multiply BY 2:" + result);

    }
}