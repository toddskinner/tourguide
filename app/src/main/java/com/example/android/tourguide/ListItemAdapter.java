package com.example.android.tourguide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by toddskinner on 11/1/16.
 */

public class ListItemAdapter extends ArrayAdapter<ListItem> {

    private int mColorResourceID;
    private Context mCon;

    public ListItemAdapter(Activity context, ArrayList<ListItem> list_items, int colorResource) {
        super(context, 0, list_items);
        mColorResourceID = colorResource;
        mCon = context;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ListItem currentListItem = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentListItem.hasImage()) {
            imageView.setImageResource(currentListItem.getImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentListItem.getName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        addressTextView.setText(currentListItem.getAddress());

        View textContainer = (View) listItemView.findViewById(R.id.text_container);
        View paddingView = (View) listItemView.findViewById(R.id.view_padding);
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        textContainer.setBackgroundColor(color);
        imageView.setBackgroundColor(color);
        paddingView.setBackgroundColor(color);

        listItemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent detailIntent = new Intent(mCon, DetailActivity.class);
                detailIntent.putExtra("name", getItem(position).getName());
                detailIntent.putExtra("address", getItem(position).getAddress());
                detailIntent.putExtra("image", getItem(position).getImageResourceID());
                mCon.startActivity(detailIntent);
            }
        });

        return listItemView;
    }
}

