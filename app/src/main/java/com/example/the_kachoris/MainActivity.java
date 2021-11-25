package com.example.the_kachoris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSignUp(View view){
        Toast.makeText(this, "This is Sign Up Page", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void openHomePage(View view){
        Toast.makeText(this, "This is Home Page", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}