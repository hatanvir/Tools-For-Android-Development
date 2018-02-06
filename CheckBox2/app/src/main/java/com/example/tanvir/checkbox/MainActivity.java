package com.example.tanvir.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView TextViewHeading,TextViewOutput;
    CheckBox checkBoxfootball,checkBoxcricket,checkBoxbadminton;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Textview finding
        TextViewHeading=findViewById(R.id.TextViewHeadingXml);
        TextViewOutput=findViewById(R.id.TextViewoutputXml);

        //checkbox finding
        checkBoxfootball=findViewById(R.id.ChechBoxFootballXml);
        checkBoxcricket=findViewById(R.id.ChechBoxCricketXml);
        checkBoxbadminton=findViewById(R.id.ChechBoxBadmintonXml);

        //button finding
        button=findViewById(R.id.ButtonXml);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //stringbuilder for storing string
                StringBuilder stringBuilder=new StringBuilder();
                if(checkBoxfootball.isChecked()){
                    String string = checkBoxfootball.getText().toString();
                    stringBuilder.append(string+" is selected"+"\n");
                }
                if(checkBoxcricket.isChecked()){
                    String string = checkBoxcricket.getText().toString();
                    stringBuilder.append(string+" is selected"+"\n");
                }
                if(checkBoxbadminton.isChecked()){
                    String string = checkBoxbadminton.getText().toString();
                    stringBuilder.append(string+" is selected"+"\n");
                }
                TextViewOutput.setText(stringBuilder);
            }
        });
    }
}
