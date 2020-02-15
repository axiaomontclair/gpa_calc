package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input1;
    EditText input2;
    EditText input3;
    EditText input4;
    EditText input5;
    Button Add_button;
    TextView result;
    View view;
    int ans=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Search by ID in xml
        input1 =findViewById(R.id.input1);
        input2 =findViewById(R.id.input2);
        input3 =findViewById(R.id.input3);
        input4 =findViewById(R.id.input4);
        input5 =findViewById(R.id.input5);
        Add_button=findViewById(R.id.button);
        result =findViewById(R.id.textView_answer);

        view= this.getWindow().getDecorView();


        Add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add_button.setText("Clear Form");

                double inp1 = Double.parseDouble(input1.getText().toString());
                double inp2 = Double.parseDouble(input2.getText().toString());
                double inp3 = Double.parseDouble(input3.getText().toString());
                double inp4 = Double.parseDouble(input4.getText().toString());
                double inp5 = Double.parseDouble(input5.getText().toString());

                double sum = (inp1 + inp2 + inp3 + inp4 + inp5)/ 5;

                result.setText(Double.toString(sum));
                if (sum<60)
                    view.setBackgroundResource(R.color.red);
                 else{
                    view.setBackgroundResource(R.color.yellow);
                }
                if(sum>80)
                view.setBackgroundResource(R.color.green);

                if(input1.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this,"Cannot be blank", Toast.LENGTH_SHORT).show();
                }

                    }
        }
        );
    }
}
