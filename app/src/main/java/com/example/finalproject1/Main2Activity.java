package com.example.finalproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Filter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ArrayList<Schools> schools = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView listView = findViewById(R.id.lv);


        Schools bsk = new Schools("British School of Kuwait","Location: Salwa Block 1 Street 1", "facilities", 1830456, "British System",R.drawable.bsk);

        Schools kes = new Schools("Kuwait English School","Location: Salwa Block 11 Street 9", "facilities",  25655216, "British System",R.drawable.keslogo);

        Schools hubs = new Schools("Hayat Universal Bilingual School","Location: Behind Platinum Health Club Block No: 1, Building No: 403, Kuwait، Sabah Al Salem", "facilities",96696728, "American System",R.drawable.hubslogo);

        Schools aus = new Schools("American United School","Location: Sabah Al Salem, Block 1, 101 street.", "facilities",25530100, "American System",R.drawable.auslogo);

        schools.add(bsk);
        schools.add(kes);
        schools.add(hubs);
        schools.add(aus);

        final SchoolAdapter adapter = new SchoolAdapter(schools,this);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Main2Activity.this,SchoolsDetails.class);
                i.putExtra("school",schools.get(position));
                startActivity(i);
            }
        });














    }
}
