package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.android.tourguide.R.id.detailAddress;
import static com.example.android.tourguide.R.id.detailName;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView detailNameTextView = (TextView) findViewById(R.id.detailName);
        TextView detailAddressTextView = (TextView) findViewById(R.id.detailAddress);

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            int intName = extras.getInt("name");
            String detailName = getResources().getString(intName);
            int intAddress = extras.getInt("address");
            String detailAddress = getResources().getString(intAddress);
            detailNameTextView.setText(detailName);
            detailAddressTextView.setText(detailAddress);
        }
    }
}
