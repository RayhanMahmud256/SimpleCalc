package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txt1;
    EditText edit1,edit2;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.TxtId1);
        edit1 = findViewById(R.id.EditId1);
        edit2 = findViewById(R.id.EditId2);
    }

    public void takeinput(){

        s1 = edit1.getText().toString();
        s2 = edit2.getText().toString();
    }

    private void calculation(int i) {
        if(s1.isEmpty() || s2.isEmpty()){
            Toast.makeText(this, "Please input something", Toast.LENGTH_SHORT).show();
        }
        else{
            switch (i){
                case 0:
                    double d = Double.parseDouble(s1)+Double.parseDouble(s2);
                    txt1.setText(String.valueOf(d));
                    break;
                case 1:
                    double d1 = Double.parseDouble(s1)-Double.parseDouble(s2);
                    txt1.setText(String.valueOf(d1));
                    break;
                case 2:
                    double d2 = Double.parseDouble(s1)*Double.parseDouble(s2);
                    txt1.setText(String.valueOf(d2));
                    break;
                case 3:
                    double d3 = Double.parseDouble(s1)/Double.parseDouble(s2);
                    txt1.setText(String.valueOf(d3));
                    break;
            }
        }
    }

    public void BtnId1(View view) {
        takeinput();
        calculation(0);
    }

    public void BtnId2(View view) {
        takeinput();
        calculation(1);
    }

    public void BtnId3(View view) {
        takeinput();
        calculation(2);
    }

    public void BtnId4(View view) {
        takeinput();
        calculation(3);
    }
}