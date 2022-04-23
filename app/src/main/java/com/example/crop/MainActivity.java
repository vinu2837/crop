package com.example.crop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button simpleImageButtonHome = (Button)findViewById(R.id.wheat);
        simpleImageButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewActivity();

            }
        });
    }
    public void openNewActivity(){
        Intent intent = new Intent(this, CropDescrip.class);
        startActivity(intent);
    }
}