package com.dev.cyka.pendroid;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int n = 1;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void shownext(View view){
        ImageView image = findViewById(R.id.imageView);
        if (n<6 && i==0){
            n++;
            String id = "pendu"+n;
            int resId = getResources().getIdentifier(id, "drawable", getPackageName());
            image.setImageResource(resId);



        }
        else if (n>1){
            i=1;
            n--;
            String id = "pendu"+n;
            int resId = getResources().getIdentifier(id, "drawable", getPackageName());
            image.setImageResource(resId);

        }
        else {
            i = 0;
            shownext(view);
        }
    }
}
