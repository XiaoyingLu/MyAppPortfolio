package com.udacity.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openApp(View view){
        int id = view.getId();
        Button button = (Button) findViewById(id);
        String appName = button.getText().toString();
        Toast.makeText(getApplicationContext(), "This button will launch my " + appName.toLowerCase() + " app!", Toast.LENGTH_SHORT).show();
    }
}
