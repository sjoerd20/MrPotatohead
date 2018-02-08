package com.example.sjoerd.mprogpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v) {
        Log.d("potato", "checkClicked");
        CheckBox checkbox = (CheckBox) v;
        if (checkbox.getText().toString().equals("Arms")) {
            ImageView imageArms = (ImageView) findViewById(R.id.armsView);
            setVisibilityimage(checkbox, imageArms, v);
        }
        else if (checkbox.getText().toString().equals("Hat")) {
            ImageView imageHat = (ImageView) findViewById(R.id.hatView);
            setVisibilityimage(checkbox, imageHat, v);
        }
        if (checkbox.getText().toString().equals("Mustache")) {
            ImageView imageMustache = (ImageView) findViewById(R.id.mustacheView);
            setVisibilityimage(checkbox, imageMustache, v);
        }
        if (checkbox.getText().toString().equals("Shoes")) {
            ImageView imageShoes = (ImageView) findViewById(R.id.shoesView);
            setVisibilityimage(checkbox, imageShoes, v);
        }
        if (checkbox.getText().toString().equals("Eyebrows")) {
            ImageView imageEyebrows = (ImageView) findViewById(R.id.eyebrowsView);
            setVisibilityimage(checkbox, imageEyebrows, v);
        }
        if (checkbox.getText().toString().equals("Eyes")) {
            ImageView imageEyes = (ImageView) findViewById(R.id.eyesView);
            setVisibilityimage(checkbox, imageEyes, v);
        }
        if (checkbox.getText().toString().equals("Ears")) {
            ImageView imageEars = (ImageView) findViewById(R.id.earsView);
            setVisibilityimage(checkbox, imageEars, v);
        }
        if (checkbox.getText().toString().equals("Glasses")) {
            ImageView imageGlasses = (ImageView) findViewById(R.id.glassesView);
            setVisibilityimage(checkbox, imageGlasses, v);
        }
        if (checkbox.getText().toString().equals("Mouth")) {
            ImageView imageMouth = (ImageView) findViewById(R.id.mouthView);
            setVisibilityimage(checkbox, imageMouth, v);
        }
        if (checkbox.getText().toString().equals("Nose")) {
            ImageView imageNose = (ImageView) findViewById(R.id.noseView);
            setVisibilityimage(checkbox, imageNose, v);
        }
    }
    public void setVisibilityimage(CheckBox checkbox, ImageView image, View v) {
        if (checkbox.isChecked()) {
            image.setVisibility(v.VISIBLE);
        }
        else {
            image.setVisibility(v.INVISIBLE);
        }
    }
}
