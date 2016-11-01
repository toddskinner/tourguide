package com.example.android.tourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        final ArrayList<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem(R.string.soulfood, R.string.soulfood_address));
        items.add(new ListItem(R.string.lordjims, R.string.lordjims_address));
        items.add(new ListItem(R.string.bolan, R.string.bolan_address));
        items.add(new ListItem(R.string.appia, R.string.appia_address));
        items.add(new ListItem(R.string.danielthaiger, R.string.danielthaiger_address));
        items.add(new ListItem(R.string.chefman, R.string.chefman_address));
        items.add(new ListItem(R.string.nahm, R.string.nahm_address));
        items.add(new ListItem(R.string.gaggan, R.string.gaggan_address));
        items.add(new ListItem(R.string.eatme, R.string.eatme_address));
        items.add(new ListItem(R.string.littlebeast, R.string.littlebeast_address));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), items, R.color.category_restaurants);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
