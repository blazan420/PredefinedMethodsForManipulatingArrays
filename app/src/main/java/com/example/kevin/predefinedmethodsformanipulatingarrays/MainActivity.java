package com.example.kevin.predefinedmethodsformanipulatingarrays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

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

        Arrays.sort(doubleValuesArray);
        String oldTxtArrayDoubleValues;
        for (int index = 0; index < doubleValuesArray.length; index++) {
            oldTxtArrayDoubleValues = txtArrayDoubleValues.getText().toString();
            txtArrayDoubleValues.setText(oldTxtArrayDoubleValues + doubleValuesArray[index] + "      ");
        }


        int[] intNumbersArray = new int[20];
        Arrays.fill(intNumbersArray, 1);
        outputTheArrayToTheScreen(intNumbersArray, txtIntNumbersArray);

        int[] integerArray1 = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        int[] integerArray1Copy = new int[integerArray1.length];

        System.arraycopy(integerArray1, 0, integerArray1Copy, 0, integerArray1.length);
        outputTheArrayToTheScreen(integerArray1, txtIntArary1);
        outputTheArrayToTheScreen(integerArray1Copy, txtIntArray1Copy);


        boolean isEqual = Arrays.equals(integerArray1, integerArray1Copy);
        swtEqual.setChecked((isEqual ? true : false));
        swtEqual.setText((isEqual ? " The Values of the arrays are equal" : " not Equal"));



    }

    public void outputTheArrayToTheScreen(int[] array, TextView textView) {
        String oldTxtViewValue;
        for (int number : array) {
            oldTxtViewValue = textView.getText().toString();
            textView.setText(oldTxtViewValue + number + "       ");
        }
    }
}
