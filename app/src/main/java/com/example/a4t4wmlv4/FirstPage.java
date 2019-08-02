package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstPage extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        button = (Button) findViewById(R.id.button_to_level04);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switchPage();
            }
        });


    }
    public void switchPage (){
        Intent intent = new Intent(this,level4.class);
        startActivity(intent);
    }
}




