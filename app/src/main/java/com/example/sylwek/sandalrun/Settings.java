package com.example.sylwek.sandalrun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sylwek.sandalrun.activities.MapsActivity;

public class Settings extends Activity {
    private EditText onTimeRefreshET;
    private EditText onDistanceRefreshET;

    public static final String REFRESH_MS = "ms";
    public static final String REFRESH_DISTANCE = "dist";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        onTimeRefreshET = (EditText) findViewById(R.id.onTimeRefreshEditText);
        onDistanceRefreshET = (EditText) findViewById(R.id.onDistanceRefreshEditText);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent data = new Intent(getApplicationContext(), MapsActivity.class);


    }
}
