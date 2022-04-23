package com.example.crop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CropDescrip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop_descrip);
        TextView intr  = (TextView)findViewById(R.id.intro);
        TextView clm  = (TextView)findViewById(R.id.clim);
        TextView sol  = (TextView)findViewById(R.id.soil);
        TextView vary  = (TextView)findViewById(R.id.varit);
        TextView sow  = (TextView)findViewById(R.id.sowing);
        TextView fer  = (TextView)findViewById(R.id.fert);
        intr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openIntroActivity();
            }
        });
        clm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openClimActivity();
            }
        });
        sol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSolActivity();
            }
        });
        vary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openVartActivity();
            }
        });
        sow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSowActivity();
            }
        });
        fer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFertActivity();
            }
        });
    }
    public void openIntroActivity(){
        Intent intent = new Intent(this, introduction.class);
        startActivity(intent);
    } public void openClimActivity(){
        Intent intent = new Intent(this, climate.class);
        startActivity(intent);
    }
    public void openSolActivity(){
        Intent intent = new Intent(this, soillll.class);
        startActivity(intent);
    }
    public void openVartActivity(){
        Intent intent = new Intent(this, varity.class);
        startActivity(intent);
    }
    public void openSowActivity(){
        Intent intent = new Intent(this, sowng.class);
        startActivity(intent);
    }
    public void openFertActivity(){
        Intent intent = new Intent(this, fertili.class);
        startActivity(intent);
    }
}