package com.br.summereletrohits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void play_envelope(View view){
        startActivity(new Intent(this, EnvelopeActivity.class));
    }

    public void wathered(View view){
        startActivity(new Intent(this, WatheredActivity.class));
    }
}