package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button mbtnNavigate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        mbtnNavigate = findViewById(R.id.buttonNavigateScreen1);
        mbtnNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this , MainActivity.class);
                startActivity(intent);
            }
        });
        Log.d("BBBB" , "Main2: onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBBB" , "Main2:onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBBB" , "Main2 :onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBBB" , "Main2 :onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBBB" , "Main2 :onstop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBBB" , "Main2 :onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBBB" , "Main2 :onDestroy");
    }
}
