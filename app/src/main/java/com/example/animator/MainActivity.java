package com.example.animator;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ObjectAnimator(View view) {
        Button btnObjectAnimator = findViewById(R.id.btnObjectAnimator);
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(this, R.animator.object_animator);
        objectAnimator.setTarget(btnObjectAnimator);
        objectAnimator.start();
    }

    public void SetAnimator(View view) {
        Button btnSetAnimator = findViewById(R.id.btnSetAnimator);
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.set_animator);
        animatorSet.setTarget(btnSetAnimator);
        animatorSet.start();
    }
}