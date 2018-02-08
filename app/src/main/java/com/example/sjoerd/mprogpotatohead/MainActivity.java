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

    // Method to check which checkbox is clicked and calls setVisibilityimage to change visibility
    public void checkClicked(View v) {
        String[] bodypartsArray = new String[]{"Arms", "Hat", "Mustache", "Shoes", "Eyebrows",
                                                "Eyes", "Ears", "Glasses", "Mouth", "Nose"};
        int[] idArray = new int[]{R.id.armsView, R.id.hatView, R.id.mustacheView, R.id.shoesView,
                                    R.id.eyebrowsView, R.id.eyesView, R.id.earsView,
                                    R.id.glassesView, R.id.mouthView, R.id.noseView};
        CheckBox checkbox = (CheckBox) v;
        Log.d("potato", "checkClicked");

        for (int i = 0; i < 8; i++) {
            if (checkbox.getText().toString().equals(bodypartsArray[i])) {
                ImageView image = (ImageView) findViewById(idArray[i]);
                setVisibilityimage(checkbox, image, v);
                break;
            }
        }
        if (checkbox.getText().toString().equals("Arms")) {
            ImageView imageArms = (ImageView) findViewById(R.id.armsView);
            setVisibilityimage(checkbox, imageArms, v);
        }
        else if (checkbox.getText().toString().equals("Hat")) {
            ImageView imageHat = (ImageView) findViewById(R.id.hatView);
            setVisibilityimage(checkbox, imageHat, v);
        }
        else if (checkbox.getText().toString().equals("Mustache")) {
            ImageView imageMustache = (ImageView) findViewById(R.id.mustacheView);
            setVisibilityimage(checkbox, imageMustache, v);
        }
        else if (checkbox.getText().toString().equals("Shoes")) {
            ImageView imageShoes = (ImageView) findViewById(R.id.shoesView);
            setVisibilityimage(checkbox, imageShoes, v);
        }
        else if (checkbox.getText().toString().equals("Eyebrows")) {
            ImageView imageEyebrows = (ImageView) findViewById(R.id.eyebrowsView);
            setVisibilityimage(checkbox, imageEyebrows, v);
        }
        else if (checkbox.getText().toString().equals("Eyes")) {
            ImageView imageEyes = (ImageView) findViewById(R.id.eyesView);
            setVisibilityimage(checkbox, imageEyes, v);
        }
        else if (checkbox.getText().toString().equals("Ears")) {
            ImageView imageEars = (ImageView) findViewById(R.id.earsView);
            setVisibilityimage(checkbox, imageEars, v);
        }
        else if (checkbox.getText().toString().equals("Glasses")) {
            ImageView imageGlasses = (ImageView) findViewById(R.id.glassesView);
            setVisibilityimage(checkbox, imageGlasses, v);
        }
        else if (checkbox.getText().toString().equals("Mouth")) {
            ImageView imageMouth = (ImageView) findViewById(R.id.mouthView);
            setVisibilityimage(checkbox, imageMouth, v);
        }
        else if (checkbox.getText().toString().equals("Nose")) {
            ImageView imageNose = (ImageView) findViewById(R.id.noseView);
            setVisibilityimage(checkbox, imageNose, v);
        }
    }

    // Method to change the visibility of the given image
    private void setVisibilityimage(CheckBox checkbox, ImageView image, View v) {
        if (checkbox.isChecked()) {
            image.setVisibility(v.VISIBLE);
        }
        else {
            image.setVisibility(v.INVISIBLE);
        }
    }
}
