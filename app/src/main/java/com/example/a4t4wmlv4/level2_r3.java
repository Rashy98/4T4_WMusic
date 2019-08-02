package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class level2_r3 extends AppCompatActivity {

        ImageView curView = null;
        private int countPair = 0;
        final int[] drawable = new int[] {
                R.drawable.sym_101,
                R.drawable.sym_102,
                R.drawable.sym_103,
                R.drawable.sym_104,
                R.drawable.sym_105,
                R.drawable.sym_106,
                R.drawable.sym_107,
                R.drawable.sym_108
        };
        int[] pos = {0,1,2,3,4,5,6,7,0,1,2,3,4,5,6,7};
        int currentPos = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2_r3);

        ImageAdapter imageAdapter = new ImageAdapter(this);
        GridView gridView = (GridView)findViewById(R.id.gridView);
        gridView.setAdapter(imageAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (currentPos < 0 ) {
                    currentPos = position;
                    curView = (ImageView) view;
                    ((ImageView) view).setImageResource(drawable[pos[position]]);
                }
                else {
                    if (currentPos == position) {
                        ((ImageView) view).setImageResource(R.drawable.hidden);
                    } else if (pos[currentPos] != pos[position]) {
                        curView.setImageResource(R.drawable.hidden);
                        Toast.makeText(level2_r3.this, "Not Match!", Toast.LENGTH_LONG).show();
                    } else {
                        ((ImageView) view).setImageResource(drawable[pos[position]]);
                        countPair++;
                        if (countPair == 8) {
                            Toast.makeText(level2_r3.this, "You Win!", Toast.LENGTH_LONG).show();
                        }
                    }
                    currentPos = -1;
                }
            }
        });
    }
}


