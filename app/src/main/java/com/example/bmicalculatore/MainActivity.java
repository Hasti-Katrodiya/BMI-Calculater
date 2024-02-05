package com.example.bmicalculatore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtweight, edtheight;
    Button btncalculate ;
    TextView txtresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Hasti", "onCreate: create hasti");
        edtheight = findViewById(R.id.edtheight);
        edtweight = findViewById(R.id.edtweight);
        txtresult = findViewById(R.id.txtresult);
        btncalculate = findViewById(R.id.btncalculate);

        Log.d("Hasti", "onCreate: create hasti 22222");


        btncalculate.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                double weight = Double.parseDouble(edtweight.getText().toString());
                double height = Double.parseDouble(edtheight.getText().toString());

                double bmi = weight / (height * height);
                Log.d("Hasti", "onCreate: create hasti 3333");
                Log.d("Hasti", "bmi:" + bmi);

                if(bmi>25){
                    txtresult.setText("You are OverWeight !! kam Khao Bhai !!");
//                    txtresult.setTextColor(getResources().getColor(R.color.redcolor));
                }
                else if(bmi<20){
                    txtresult.setText("You are UnderWeight !! kuchh Khao Bhai");
//                    txtresult.setTextColor(getResources().getColor(R.color.yellowcolor));
                }
                else{
                    txtresult.setText("You are Healthy !! Tu Thik hai Bhai");
//                    txtresult.setTextColor(getResources().getColor(R.color.greencolor));
                }

            }


        });

    }
}