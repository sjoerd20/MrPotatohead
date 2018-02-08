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
