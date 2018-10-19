package com.loopwiki.loginregisterwithsqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class bikespecss extends AppCompatActivity {
    ImageButton activa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bikespecss);
        activa=(ImageButton)findViewById(R.id.iBactiva);
        activa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(bikespecss.this,b1.class);
                startActivity(intent);
            }
        });
    }
}
