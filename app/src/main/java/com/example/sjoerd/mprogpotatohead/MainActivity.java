package com.example.sjoerd.mprogpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    String[] bodypartsArray = new String[]{"Arms", "Hat", "Mustache", "Shoes", "Eyebrows",
            "Eyes", "Ears", "Glasses", "Mouth", "Nose"};
    int[] idArray = new int[]{R.id.armsView, R.id.hatView, R.id.mustacheView, R.id.shoesView,
            R.id.eyebrowsView, R.id.eyesView, R.id.earsView,
            R.id.glassesView, R.id.mouthView, R.id.noseView};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("onCreate", "Creating");
        if (savedInstanceState != null) {
            Log.d("onCreate", "savedInstanceState not null");
            for (int i = 0; i < 10; i++) {
                ImageView image = (ImageView) findViewById(idArray[i]);
                if (image != null) {
                    Log.d("onCreate", "image not null");
                    int visible = savedInstanceState.getInt(bodypartsArray[i]);
                    image.setVisibility(visible);
                }
            }
        }


    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Loops over all body parts to change visibility of the checked body part
        for (int i = 0; i < 10; i++) {
            Log.d("onSave", "Saving");
            ImageView image = (ImageView) findViewById(idArray[i]);
            outState.putInt(bodypartsArray[i], image.getVisibility());
        }
    }

    // Method to check which checkbox is clicked and calls setVisibilityimage to change visibility
    public void checkClicked(View v) {

        CheckBox checkbox = (CheckBox) v;
        Log.d("potato", "checkClicked");

        // Loops over all body parts to change visibility of the checked body part
        for (int i = 0; i < 10; i++) {
            if (checkbox.getText().toString().equals(bodypartsArray[i])) {
                ImageView image = (ImageView) findViewById(idArray[i]);
                setVisibilityimage(checkbox, image, v);
                break;
            }
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
