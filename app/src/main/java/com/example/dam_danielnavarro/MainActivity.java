package com.example.dam_danielnavarro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.buttonEnviar);
        btn.setOnClickListener( e -> Toast.makeText(this,"Datos enviados",
                Toast.LENGTH_LONG).show());
    }
}