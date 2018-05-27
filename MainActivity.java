package com.example.sagar.lab2;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
ConstraintLayout con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        con=findViewById(R.id.con);
    }

    public void red(MenuItem item) {
    con.setBackgroundColor(Color.RED);
    }

    public void green(MenuItem item) {
        con.setBackgroundColor(Color.GREEN);
    }


    public void blue(MenuItem item) {
        con.setBackgroundColor(Color.BLUE);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

}
