package com.example.excite.imageviewcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private int imageWidth, imageHeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //リニアレイアウトの設定
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        //レイアウトを中央寄せにするためMATCH＿PARENTにする
        layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT));
        //レイアウトを中央寄せにする
        layout.setGravity(Gravity.CENTER);
        setContentView(layout);

        //画像の設定
        final ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.test);
        imageWidth = 300;
        imageHeight = 300;
        //レイアウトに張り付け
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(imageWidth, imageHeight);
        imageView.setLayoutParams(layoutParams);
        layout.addView(imageView);

        //ボタンの作成
        Button button = new Button(this);
        button.setText("Button");

        LinearLayout.LayoutParams buttonLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        button.setLayoutParams(buttonLayoutParams);
        layout.addView(button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                imageWidth += 100;
                imageHeight += 100;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(imageWidth, imageHeight);
                imageView.setLayoutParams(layoutParams);
            }
        });
    }
}
