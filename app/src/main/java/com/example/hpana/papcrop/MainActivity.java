package com.example.hpana.papcrop;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.edmodo.cropper.CropImageView;
import com.theartofdev.edmodo.cropper.CropImage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        com.theartofdev.edmodo.cropper.CropImageView cropImageView= (com.theartofdev.edmodo.cropper.CropImageView) findViewById(R.id.cropImageView);
        cropImageView.setImageUriAsync(Uri.parse("android.resource://com.example.hpana.papcrop/drawable/fff"));


    }
}
