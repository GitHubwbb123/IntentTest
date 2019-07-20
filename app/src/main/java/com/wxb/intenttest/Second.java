package com.wxb.intenttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=getIntent();
        String st=intent.getStringExtra("data");
        Toast.makeText(Second.this,st,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();不能执行这一句，这一句会销毁活动，然后不会执行下面的程序。
        Intent intent=new Intent();
        intent.putExtra("second","来自第二个Acitvity");
        setResult(RESULT_OK,intent);
        finish();
    }
}
