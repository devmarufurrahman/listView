package com.example.listviewtype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Spinner spinner;
    AutoCompleteTextView autoText;

    ArrayList<String> arrIds = new ArrayList<>();
    ArrayList<String> arrNames = new ArrayList<>();
    ArrayList<String> arrLanguage = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // id set
        listView = findViewById(R.id.listView);
        spinner = findViewById(R.id.selectItem);
        autoText = findViewById(R.id.autoText);


        // list adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrNames);
        listView.setAdapter(adapter);

        // spinner adapter
        ArrayAdapter<String> spinnerAdaptar = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, arrIds);
        spinner.setAdapter(spinnerAdaptar);

        // auto text adapter
        ArrayAdapter<String> autoAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrLanguage);
        autoText.setAdapter(autoAdapter);
        autoText.setThreshold(1);


        // spinner array add
        arrIds.add("NID card");
        arrIds.add("Passport Id");
        arrIds.add("Birth id");
        arrIds.add("Employee id");


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0){
                    Toast.makeText(MainActivity.this, "This is 1st list", Toast.LENGTH_SHORT).show();
                }

            }
        });




        // list view array add
        arrNames.add("Noman");
        arrNames.add("Maruf");
        arrNames.add("Sadik");
        arrNames.add("Rohan");
        arrNames.add("Niloy");
        arrNames.add("Rahul");
        arrNames.add("Noman");
        arrNames.add("Maruf");
        arrNames.add("Sadik");
        arrNames.add("Rohan");
        arrNames.add("Niloy");
        arrNames.add("Rahul");
        arrNames.add("Noman");
        arrNames.add("Maruf");
        arrNames.add("Sadik");
        arrNames.add("Rohan");
        arrNames.add("Niloy");
        arrNames.add("Rahul");



        // auto text array add
        arrLanguage.add("C");
        arrLanguage.add("C++");
        arrLanguage.add("C#");
        arrLanguage.add("Java");
        arrLanguage.add("JavaScript");
        arrLanguage.add("Python");
        arrLanguage.add("PHP");

    }


}

