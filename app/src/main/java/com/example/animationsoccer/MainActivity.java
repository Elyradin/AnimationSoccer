package com.example.animationsoccer;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ObjectAnimator mAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgViewBola = findViewById(R.id.imgBall);
        Button btn = findViewById(R.id.button);

        mAnimator = ObjectAnimator.ofFloat(imgViewBola, "y", 1500, (-500));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAnimator.setDuration(1500);
                mAnimator.start();
            }
        });
    }
}