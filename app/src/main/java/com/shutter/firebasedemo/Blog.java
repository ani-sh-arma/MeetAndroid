package com.shutter.firebasedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Blog extends AppCompatActivity {

    FirebaseAuth auth = FirebaseAuth.getInstance();

    TextView logout , blog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        logout = findViewById(R.id.logout);
        blog = findViewById(R.id.shop);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auth.signOut();
                Toast.makeText(Blog.this, "Logged Out !", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Blog.this,StartActivity.class));
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Blog.this,shoppingActivity.class));
            }
        });


    }
}