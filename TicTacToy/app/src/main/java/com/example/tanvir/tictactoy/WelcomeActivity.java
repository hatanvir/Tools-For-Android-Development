package com.example.tanvir.tictactoy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        button=findViewById(R.id.ButtonClickXmlID);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity();
            }
        });
    }

    public void nextActivity() {

        Intent intent = new Intent(WelcomeActivity.this, GameActivity.class);
        startActivity(intent);
        finish();

    }
}
