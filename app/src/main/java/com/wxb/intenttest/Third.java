package com.wxb.intenttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent intent=getIntent();
        String st=intent.getStringExtra("data");
        Toast.makeText(Third.this,st,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent();
        intent.putExtra("third","来自第三个Acitvity");
        setResult(RESULT_OK,intent);
        finish();
    }
}
