package com.example.tanvir.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.dateTextViewIdXml);
        button=findViewById(R.id.DateSelectButtonIdXml);
        datePicker=findViewById(R.id.DatePickerIdXml);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(dateSelectWork());
            }
        });
    }
    //storing date,month,year on stringbuilder
    private String dateSelectWork(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(datePicker.getDayOfMonth()+"-");
        stringBuilder.append(datePicker.getMonth()+1+"-");
        stringBuilder.append(datePicker.getYear());

        return stringBuilder.toString();
    }
}
