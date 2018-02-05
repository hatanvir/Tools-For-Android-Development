package com.example.tanvir.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finding ListView
        listView=findViewById(R.id.ListViewXmlId);
        //accesing string from string.xml
        final String[] countryName=getResources().getStringArray(R.array.country_name);
        //adapter for connecting ListView
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter(this,R.layout.shape,R.id.shapeForListView,countryName);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String values=countryName[i];
                Toast.makeText(MainActivity.this,values,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
