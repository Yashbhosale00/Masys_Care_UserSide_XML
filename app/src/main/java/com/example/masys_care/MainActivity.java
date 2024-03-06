package com.example.masys_care;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<SlideModel> imageList = new ArrayList<>();
        SlideModel slide1 = new SlideModel("https://media.licdn.com/dms/image/D4D22AQGhf4tMcmdURQ/feedshare-shrink_800/0/1706608372510?e=1710979200&v=beta&t=9_dL2TwLkKGpgEned8r6CebQlnbo3O4w3DZuSUrktYg", ScaleTypes.FIT);
//        slide1.setTitle("MASYS TECH SOLUTION PVT.LTD.");
        imageList.add(slide1);

        SlideModel slide2 = new SlideModel("https://media.licdn.com/dms/image/D4D22AQEadZTYFpPWyA/feedshare-shrink_800/0/1706013687281?e=1710979200&v=beta&t=tfF3UwBdp_bVk6_-BONy-in4qPqTmgZ7tyj3BdzFLyA", ScaleTypes.FIT);
//        slide2.setTitle("MASYS TECH SOLUTION PVT.LTD.");
        imageList.add(slide2);

        SlideModel slide3 = new SlideModel("https://media.licdn.com/dms/image/D4D22AQEWzw-mGqQTmw/feedshare-shrink_800/0/1705998167530?e=1710979200&v=beta&t=qsU2rwLLuDv5lTI5rU9V-MfmaEe2to-jajRg2M5h4ds", ScaleTypes.FIT);
//        slide3.setTitle("MASYS TECH SOLUTION PVT.LTD.");
        imageList.add(slide3);

        SlideModel slide4 = new SlideModel("https://media.licdn.com/dms/image/D4D22AQHg51uml2_RGg/feedshare-shrink_800/0/1705063830262?e=1711584000&v=beta&t=3aCdlu1ytikMiCQbxXbFB2J-yE1XmB9pTyjL5IsuxJo", ScaleTypes.FIT);
//        slide3.setTitle("MASYS TECH SOLUTION PVT.LTD.");
        imageList.add(slide4);

        SlideModel slide5 = new SlideModel("https://media.licdn.com/dms/image/D4D22AQGW3V7t_DG34Q/feedshare-shrink_800/0/1704523990803?e=1711584000&v=beta&t=0onPs17fUXEiF2WhNzqXp5MQF7JYDU6o6rH5jUpzf8s", ScaleTypes.FIT);
//        slide3.setTitle("MASYS TECH SOLUTION PVT.LTD.");
        imageList.add(slide5);


        ImageSlider imageSlider = findViewById(R.id.image_slider);
        imageSlider.setImageList(imageList);
    }
}