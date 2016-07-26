package com.example.excite.imagedrag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{

    private ImageView imageView;
    private int preDx, preDy, newDx, newDy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);

        //画像にリスナーをセット
        imageView.setOnTouchListener(this);
        preDx = preDy = newDx = newDy = 0;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event){
        //x,yの位置情報取得
        newDx = (int)event.getRawX();
        newDy = (int)event.getRawY();

        switch(event.getAction()){
            //タッチダウンでdragされた
            case MotionEvent.ACTION_MOVE:
                //ACTION_MOVEでの位置
                int dx = imageView.getLeft() + (newDx - preDx);
                int dy = imageView.getTop() + (newDy - preDy);

                //画像の位置を設定する
                imageView.layout(dx, dy, dx + imageView.getWidth(), dy + imageView.getHeight());
                Log.d("onTouch" , "ACTION_MOVE: dx =" + dx + ",dy = " + dy);
                break;
        }
        preDx = newDx;
        preDy = newDy;

        return true;
    }
}
