package com.example.android.tourguide;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
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
        TextView detailDescriptionTextView = (TextView) findViewById(R.id.detailDescription);
        ImageView image = (ImageView) findViewById(R.id.detailImage);

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            int intName = extras.getInt("name");
            String detailName = getResources().getString(intName);

            int intAddress = extras.getInt("address");
            String detailAddress = getResources().getString(intAddress);

            int intDescription = extras.getInt("description");
            String detailDescription = getResources().getString(intDescription);

            detailNameTextView.setText(detailName);
            detailAddressTextView.setText(detailAddress);
            detailDescriptionTextView.setText(detailDescription);

            int intImage = extras.getInt("image");
            image.setImageResource(intImage);
        }
    }
}
