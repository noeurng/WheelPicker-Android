package com.noeurng.wheelpicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aigestudio.wheelpicker.WheelPicker;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WheelPicker wheelPicker = (WheelPicker) findViewById(R.id.wheel_picker);
        List<String> provinces = new ArrayList<>();
        String[] str = getResources().getStringArray(R.array.provinces);
        for (int i = 0; i < str.length; i++) {
            provinces.add(str[i]);
        }
        wheelPicker.setData(provinces);
    }
}
