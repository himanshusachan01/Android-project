package com.example.fullapplication;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.annotation.Annotation;

public class Twensev extends AppCompatActivity implements SensorEventListener{
    Sensor s;
    SensorManager sm;
    CameraManager cm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_twensev);
        cm = (CameraManager) getSystemService(CAMERA_SERVICE);
        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        s = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sm.registerListener((SensorEventListener) this, s, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        float x = sensorEvent.values[0];
        float y = sensorEvent.values[1];
        float z = sensorEvent.values[2];
        int x1 = (int)x;
        int y1 = (int)y;
        int z1 = (int)z;
        if(x1 >= 1){
            try{
                String t = cm.getCameraIdList()[0];
                cm.setTorchMode(t,true);
            }
            catch(CameraAccessException e){}
        }else {
            try{
                String t = cm.getCameraIdList()[0];
                cm.setTorchMode(t,false);
            }
            catch(CameraAccessException e){}
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}


