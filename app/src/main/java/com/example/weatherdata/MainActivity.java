package com.example.weatherdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Button btn_cityID, btn_getWeahterByID, getBtn_getWeahterByName;
    EditText et_dataInput;
    ListView lv_weatherReport;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_cityID, btn_getWeatherByID, btn_getWeatherByName;
    }
}