package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnNavigate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("BBBB" , "onCreate");

        mBtnNavigate = findViewById(R.id.buttonNavigateScreen2);
        mBtnNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBBB" , "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBBB" , "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBBB" , "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBBB" , "onstop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBBB" , "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBBB" , "onDestroy");
    }
}
