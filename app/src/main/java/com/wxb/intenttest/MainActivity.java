package com.wxb.intenttest;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        final Button second=findViewById(R.id.button1);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Second.class);
                intent.putExtra("data","第一个到第二个Activity");
                startActivityForResult(intent,2);
            }
        });
        Button third=findViewById(R.id.button2);
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Third.class);
                intent.putExtra("data","第一个到第三个Activity");
                startActivityForResult(intent,3);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 2:
                if(resultCode==RESULT_OK){
                    String st =data.getStringExtra("second");
                    Toast.makeText(MainActivity.this,st,Toast.LENGTH_SHORT).show();
                }
                break;
            case 3:
                if(resultCode==RESULT_OK){
                    String st =data.getStringExtra("third");
                    Toast.makeText(MainActivity.this,st,Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
