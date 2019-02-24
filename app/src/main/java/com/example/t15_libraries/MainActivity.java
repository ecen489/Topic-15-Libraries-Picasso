package com.example.t15_libraries;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = (ImageView) findViewById(R.id.photo);
        Picasso.get()
                .load("https://upload.wikimedia.org/wikipedia/commons/d/d4/Siberian_Tiger_by_Malene_Th.jpg")
                .into(img);
    }
}
