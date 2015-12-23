package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void spotifyMethod(View view){
        Toast.makeText(this, R.string.firstAppToast,Toast.LENGTH_SHORT).show();
    }

    public void scoresMethod(View view){
        Toast.makeText(this, R.string.secondAppToast,Toast.LENGTH_SHORT).show();
    }

    public void libraryMethod(View view){
        Toast.makeText(this, R.string.thirdAppToast,Toast.LENGTH_SHORT).show();
    }

    public void buildItMethod(View view){
        Toast.makeText(this, R.string.fourthAppToast,Toast.LENGTH_SHORT).show();
    }

    public void readerMethod(View view){
        Toast.makeText(this, R.string.fifthAppToast,Toast.LENGTH_SHORT).show();
    }

    public void capstoneMethod(View view){
        Toast.makeText(this, R.string.sixthAppToast,Toast.LENGTH_SHORT).show();
    }
}
