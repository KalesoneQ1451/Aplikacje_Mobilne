package com.example.aplikacje_mobilne;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button buttonDisable;
    private Button reset;
    private int licznik;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDisable = findViewById(R.id.buttonDisable);
        reset = findViewById(R.id.reset);
        text = findViewById(R.id.textView);

        buttonDisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonDisable.setEnabled(false);
                licznik++;
                text.setText("Counter: " + licznik);
                Toast.makeText(MainActivity.this, "Przycisk zostal wylaczony", Toast.LENGTH_SHORT).show();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonDisable.setEnabled(true);
                Toast.makeText(MainActivity.this, "Zresetowano", Toast.LENGTH_SHORT).show();
            }
        });
    }
}