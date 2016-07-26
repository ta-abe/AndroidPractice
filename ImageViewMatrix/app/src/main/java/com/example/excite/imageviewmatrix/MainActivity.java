package com.example.excite.imageviewmatrix;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(),R.drawable.test);
        imageView.setImageBitmap(bitmap1);
    }
}
