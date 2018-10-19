package com.loopwiki.loginregisterwithsqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class homee extends AppCompatActivity {
    ImageButton bike,hatchback,sedan,premium,suv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homee);
        bike=(ImageButton)findViewById(R.id.bbike);
        hatchback=(ImageButton)findViewById(R.id.bhatchback);
        sedan=(ImageButton)findViewById(R.id.bsedan);
        premium=(ImageButton)findViewById(R.id.bpremium);
        suv=(ImageButton)findViewById(R.id.bsuv);
        bike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(homee.this,bikespecss.class);
                startActivity(intent);
            }
        });
        hatchback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(homee.this,hatchbackspecss.class);
                startActivity(intent);
            }
        });
        sedan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(homee.this,sedanspecss.class);
                startActivity(intent);
            }
        });
        premium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(homee.this,premiumspecss.class);
                startActivity(intent);
            }
        });
        suv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(homee.this,suvspecss.class);
                startActivity(intent);
            }
        });
    }
}
