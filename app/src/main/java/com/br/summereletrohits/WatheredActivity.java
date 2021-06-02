package com.br.summereletrohits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WatheredActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wathered);
    }

    public void voltarHome(View view){
        startActivity(new Intent(this, HomeActivity.class));
    }
}