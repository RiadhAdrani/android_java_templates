package com.example.myTemplates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button startNewActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startNewActivityButton = findViewById(R.id.button_view);
        startNewActivityButton.setOnClickListener(view -> {
            Intent intent = new Intent(this,ActivityTwo.class);
            App.sendOnChannel(
                    this,
                    App.CHANNEL_1_ID,
                    1,
                    "Hello",
                    "A notification has appeared",
                    R.drawable.ic_android
            );
            startActivity(intent);
        });
    }
}