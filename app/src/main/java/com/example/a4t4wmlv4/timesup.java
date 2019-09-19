package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class timesup extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timesup);

        btn = (Button) findViewById(R.id.goback);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                goBack(view);
            }
        });


    }

    public void goBack(View v)
    {
        Intent a = getIntent();
        String previous = a.getStringExtra("From_activity");
        if(previous == "01") {
            Intent intent = new Intent(this, level04_01.class);
            startActivity(intent);
        }
        else if(previous == "02")
        {
            Intent intent = new Intent(this, level04S2.class);
            startActivity(intent);
        }
        else if(previous == "03")
        {
            Intent intent = new Intent(this, level04_int03.class);
            startActivity(intent);
        }
        else if(previous == "04")
        {
            Intent intent = new Intent(this, level04_int04.class);
            startActivity(intent);
        }
        else if(previous == "lvl2_1")
        {
            Intent intent = new Intent(this, level2_int1.class);
            startActivity(intent);
        }
        else if(previous == "lvl2_2")
        {
            Intent intent = new Intent(this, level2_int2.class);
            startActivity(intent);
        }
        else if(previous == "lvl2_3")
        {
            Intent intent = new Intent(this, level2_int3.class);
            startActivity(intent);
        }

    }
}
