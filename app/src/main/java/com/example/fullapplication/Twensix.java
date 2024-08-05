package com.example.fullapplication;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Twensix extends AppCompatActivity implements SensorEventListener{
    MediaPlayer mp;
    Sensor s;
    SensorManager sm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_twensix);
        mp = MediaPlayer.create(this, R.raw.y);
        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        s = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sm.registerListener((SensorEventListener) this, s, SensorManager.SENSOR_DELAY_NORMAL);
    }
        public void onSensorChanged(SensorEvent sensorEvent) {
            float x = sensorEvent.values[0];
            float y = sensorEvent.values[1];
            float z = sensorEvent.values[2];
            int x1 = (int)x;
            int y1 = (int)y;
            int z1 = (int)z;
            if(x1 > 1){
                mp.start();
            }
            else{
                mp.pause();
            }
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int i) {

        }
    }