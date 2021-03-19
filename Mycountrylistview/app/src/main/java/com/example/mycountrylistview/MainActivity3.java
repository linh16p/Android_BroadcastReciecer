package com.example.mycountrylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button lol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lol = (Button) findViewById(R.id.lol);
        Bundle bd = getIntent().getExtras();
        String data = bd.getString("countryList");
        Toast.makeText(getApplicationContext(),data,Toast.LENGTH_SHORT).show();
        lol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}