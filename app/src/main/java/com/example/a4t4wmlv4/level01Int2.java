package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class level01Int2 extends AppCompatActivity {



    public void fade (View view){

        ImageView m1 = findViewById(R.id.imageView1);
        ImageView m2 = findViewById(R.id.imageView7);

        m1.animate().alpha(0f).setDuration(2000);
        m2.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level01_int2);
    }
}
