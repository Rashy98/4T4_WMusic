package com.example.a4t4wmlv4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.logging.Level;

public class Level2 extends AppCompatActivity {

    TextView Tv1,Tv2;

    ImageView imageView1_1,imageView1_2,imageView1_3,imageView1_4,imageView2_1,imageView2_2,imageView2_3,imageView2_4,
            imageView3_1,imageView3_2,imageView3_3,imageView3_4,imageView4_1,imageView4_2,imageView4_3,imageView4_4;

    Integer[] cardsArray = {101,102,103,104,105,106,107,108,201,202,203,204,205,206,207,208};

    int sym_101,sym_102,sym_103,sym_104,sym_105,sym_106,sym_107,sym_108,
            sym_201,sym_202,sym_203,sym_204,sym_205,sym_206,sym_207,sym_208;

    int firstCard,secondCard;
    int ClickedFirst,ClickedSecond;
    int cardNumber = 1;

    int turn = 1;
    int playerPoints = 0,cpuPoints = 0;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_level2);

        Tv1 = (TextView)findViewById(R.id.Tv1);
        Tv2 = (TextView)findViewById(R.id.Tv2);

        imageView1_1 = (ImageView)findViewById(R.id.imageView1_1);
        imageView1_2 = (ImageView)findViewById(R.id.imageView1_2);
        imageView1_3 = (ImageView)findViewById(R.id.imageView1_3);
        imageView1_4 = (ImageView)findViewById(R.id.imageView1_4);
        imageView2_1 = (ImageView)findViewById(R.id.imageView2_1);
        imageView2_2 = (ImageView)findViewById(R.id.imageView2_2);
        imageView2_3 = (ImageView)findViewById(R.id.imageView2_3);
        imageView2_4 = (ImageView)findViewById(R.id.imageView2_4);
        imageView3_1 = (ImageView)findViewById(R.id.imageView3_1);
        imageView3_2 = (ImageView)findViewById(R.id.imageView3_2);
        imageView3_3 = (ImageView)findViewById(R.id.imageView3_3);
        imageView3_4 = (ImageView)findViewById(R.id.imageView3_4);
        imageView3_1 = (ImageView)findViewById(R.id.imageView4_1);
        imageView4_2 = (ImageView)findViewById(R.id.imageView4_2);
        imageView4_3 = (ImageView)findViewById(R.id.imageView4_3);
        imageView4_4 = (ImageView)findViewById(R.id.imageView4_4);


        imageView1_1.setTag("0");
        imageView1_2.setTag("0");
        imageView1_3.setTag("0");
        imageView1_4.setTag("0");
        imageView2_1.setTag("0");
        imageView2_2.setTag("0");
        imageView2_3.setTag("0");
        imageView2_4.setTag("0");
        imageView3_1.setTag("0");
        imageView3_2.setTag("0");
        imageView3_3.setTag("0");
        imageView3_4.setTag("0");
        imageView4_1.setTag("0");
        imageView4_2.setTag("0");
        imageView4_3.setTag("0");
        imageView4_4.setTag("0");


//        frontOfCradsResources();
    }
//
//    private void frontOfCradsResources()
//
//        imageView1_1= R.drawable.sym_101;
//        imageView1_2= R.drawable.sym_102;
//        imageView1_3= R.drawable.sym_103;
//        imageView1_4= R.drawable.sym_104;
//        imageView2_1= R.drawable.sym_105;
//        imageView2_2= R.drawable.sym_106;
//        imageView2_3= R.drawable.sym_107;
//        imageView2_4= R.drawable.sym_108;
//        imageView3_1= R.drawable.sym_201;
//        imageView3_2= R.drawable.sym_202;
//        imageView3_3= R.drawable.sym_203;
//        imageView3_4= R.drawable.sym_204;
//        imageView4_1= R.drawable.sym_205;
//        imageView4_2= R.drawable.sym_206;
//        imageView4_3= R.drawable.sym_207;
//        imageView4_4= R.drawable.sym_208;
//
//
//
//    }
//
//    ImageView curView = null;
//    private int countPair = 0;
//    final int[] drawable = new int[]{R.drawable.sym_101, R.drawable.sym_102,R.drawable.sym_103,R.drawable.sym_104,
//            R.drawable.sym_105,R.drawable.sym_106,R.drawable.sym_107,R.drawable.sym_108};
//
//    int[] pos = {0,1,2,3,4,5,6,7,0,1,2,3,4,5,6,7};
//    int currentPos = -1;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_level2);
//
//        GridView gridView = (GridView) findViewById(R.id.gridView);
//        ImageAdapter imageAdapter = new ImageAdapter(this);
//        gridView.setAdapter(imageAdapter);
//
////        gridView.setOnClickListener(new AdapterView.OnItemClickListener(){
////
////            @Override
////            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
////
////                if (currentPos < 0) {
////
////                    currentPos = position;
////                    curView = (ImageView) view;
////                    ((ImageView) view).setImageResource(drawable[pos[position]]);
////
////                } else
////                    {
////                        if (currentPos == position)
////                        {
////
////                            ((ImageView) view).setImageResource(R.drawable.hidden);
////                        }
////                        else if (pos[currentPos] != pos[position])
////                        {
////                            curView.setImageResource(R.drawable.hidden);
////                            Toast.makeText(Level2.this, "Not Match!", Toast.LENGTH_LONG).show();
////                        }
////                        else
////                            {
////                                ((ImageView) view).setImageResource(drawable[pos[position]]);
////                                countPair++;
////                                if (countPair == 8)
////                                {
////                                    Toast.makeText(Level2.this, "You Win!", Toast.LENGTH_LONG).show();
////                                }
////                        }
////                }
////            }
////        });
 //   }

}
