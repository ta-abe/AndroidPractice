package com.example.excite.imageviewrotation;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
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

        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.test);

        //画像の縦、横サイズを取得
        int imageWidth = bitmap1.getWidth();
        int imageHeight = bitmap1.getHeight();

        //Matrixインスタンス作成
        Matrix matrix = new Matrix();

        //画像中心を起点に90度回転
        matrix.setRotate(198, imageWidth/2, imageHeight/2);

        //90度回転したBitmap画像を生成
        Bitmap bitmap2 = Bitmap.createBitmap(bitmap1, 0 , 0 , imageWidth, imageHeight, matrix, true);

        imageView.setImageBitmap(bitmap2);
    }
}
