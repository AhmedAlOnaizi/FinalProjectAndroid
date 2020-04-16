package com.example.finalproject1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class SchoolsDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schools_details);




        Bundle data = getIntent().getExtras();

        Schools x = (Schools) data.getSerializable("school");

        TextView name = findViewById(R.id.nm);
        name.setText(x.getName()+ "");

        TextView location = findViewById(R.id.loc);
        location.setText(x.getLocation() + "");

        TextView information = findViewById(R.id.inf);
        information.setText(x.getInfo() + "");

        final TextView number = findViewById(R.id.number);
        number.setText(x.getNumber() + "");

        TextView facilities = findViewById(R.id.fac);
        facilities.setText(x.getFacilities() + "");

        Button facilit = findViewById(R.id.fac);

        facilit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(SchoolsDetails.this,Main3Activity.class);
                startActivity(i2);
            }
        });

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Intent.ACTION_DIAL);
                i3.setData(Uri.parse("tel: " + number));
                startActivity(i3);
            }
        });

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/@?api=1&map_action=map"));
                startActivity(i4);
            }
        });








    }
}
