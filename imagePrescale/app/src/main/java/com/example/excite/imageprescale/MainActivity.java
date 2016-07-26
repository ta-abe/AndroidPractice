package com.example.excite.imageprescale;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.imageView);

        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(),R.drawable.test);
        int imageWidth = bitmap1.getWidth();
        int imageHeight = bitmap1.getHeight();

        //Matrixインスタンス作成
        Matrix matrix = new Matrix();

        //縮小率の設定
        float ratio = 0.5f;

        //リサイズ
        matrix.preScale(ratio , ratio);

        //
        Bitmap bitmap3 = Bitmap.createBitmap(bitmap1, 0, 0, imageWidth, imageHeight, matrix, true);

        //Drawableに変換
        Drawable drawable = new BitmapDrawable(getResources(), bitmap3);

        imageView.setImageDrawable(drawable);
    }
}
