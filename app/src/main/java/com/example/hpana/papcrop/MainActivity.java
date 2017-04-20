package com.example.hpana.papcrop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.edmodo.cropper.CropImageView;
import com.theartofdev.edmodo.cropper.CropImage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CropImageView cropImageView = (CropImageView) findViewById(R.id.CropImageView);
        cropImageView.setAspectRatio(5, 5);
        cropImageView.setFixedAspectRatio(true);
        cropImageView.setGuidelines(1);
        cropImageView.setImageDrawable(getApplicationContext().getResources().getDrawable(R.drawable.fff));

        
    }
}
