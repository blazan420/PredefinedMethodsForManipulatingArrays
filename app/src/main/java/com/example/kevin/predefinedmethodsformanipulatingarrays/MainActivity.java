package com.example.kevin.predefinedmethodsformanipulatingarrays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txtArrayDoubleValues = (TextView)findViewById(R.id.txtArrayDoubleValues);
        TextView txtIntNumbersArray = (TextView)findViewById(R.id.txtArrayIntegerNumbers);
        TextView txtIntArary1 = (TextView)findViewById(R.id.txtIntArray1);
        TextView txtIntArray1Copy = (TextView)findViewById(R.id.txtIntArray1Copy);
        TextView txtLocationOfArrayElement = (TextView)findViewById(R.id.txtLocationArrayElement);
        Switch swtEqual = (Switch) findViewById(R.id.swtEqual);

        double[] doubleValuesArray = { 6.3, 1.2, 3.8, 2.7, 9.1, 4.3, 56.4, 34.2, 90.1, 12.4, 54.2, 79.1, 10.2 };




    }
}
