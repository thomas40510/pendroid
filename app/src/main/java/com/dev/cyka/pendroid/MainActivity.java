package com.dev.cyka.pendroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int n = 1;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void shownext(View view){
        ImageView image = findViewById(R.id.imageView); //on déclare l'image (élément du layout)
        if (n<6 && i==0){ //si on parcourt dans l'ordre croissant
            n++; //on incrémente n
            String id = "pendu"+n; //on définit le nom de l'image à afficher dans un String
            int resId = getResources().getIdentifier(id, "drawable", getPackageName()); //on convertit le nom de l'image en id de ressource
            image.setImageResource(resId); //on affiche l'image à la place de la précédente



        }
        else if (n>1){ //si on parcourt dans l'ordre décroissant
            i=1;
            n--; //on décrémente n
            String id = "pendu"+n;
            int resId = getResources().getIdentifier(id, "drawable", getPackageName());
            image.setImageResource(resId);

        }
        else { //si on arrive à l'image n°1
            i = 0;
            shownext(view); //on relance tout de suite la méthode (pour afficher l'image suivante)
        }
    }
}
