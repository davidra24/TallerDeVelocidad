package com.example.david.tallerdevelocidad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button comenzarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setActions();
    }
    private void init(){
        this.comenzarBtn = (Button) findViewById(R.id.comenzarBtn);
    }
    private void setActions(){
        this.comenzarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Principal.class));
            }
        });
    }
}
