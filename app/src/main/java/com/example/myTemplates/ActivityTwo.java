package com.example.myTemplates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.muddzdev.styleabletoast.StyleableToast;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        StyleableToast.makeText(this,getString(R.string.styleable_toast),R.style.MyToastStyle).show();
    }
}