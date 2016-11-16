package org.siewers.who_are_you;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkGuts(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView cookieImage = (ImageView) findViewById(R.id.android_cookie_image_view);
        cookieImage.setImageResource(R.drawable.static_qr_code_without_logo);
        TextView eatText = (TextView) findViewById(R.id.status_text_view);
        TextView buttonText = (TextView) findViewById(R.id.button_view);
        buttonText.setText("Ready!");
    }
}
