package com.example.sylwek.sandalrun.activities;

import android.app.Activity;

import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

import com.example.sylwek.sandalrun.R;


public class MainActivity extends Activity {

    private Button goToMapButton;
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToMapButton = (Button) findViewById(R.id.goToMapButton);

        LocationManager service = (LocationManager)         getSystemService(LOCATION_SERVICE);
        boolean enabled = service.isProviderEnabled(LocationManager.GPS_PROVIDER);
        // Check if enabled and if not send user to the GSP settings. Better
        // solution would be to display a dialog and suggesting to go to the
        // settings
         if (!enabled) {
          Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
           startActivity(intent); }

        goToMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapActivityIntent = new Intent(getApplicationContext(), MapsActivity.class);

                startActivity(mapActivityIntent);
            }
        });

    }


}