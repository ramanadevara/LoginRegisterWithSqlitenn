package com.loopwiki.loginregisterwithsqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class b1 extends AppCompatActivity {
    Button book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b1);
        book=(Button)findViewById(R.id.button);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(b1.this,Success.class);
                startActivity(intent);
            }
        });

    }
}
