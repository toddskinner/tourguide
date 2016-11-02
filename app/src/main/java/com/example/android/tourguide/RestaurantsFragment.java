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
        items.add(new ListItem(R.string.soulfood, R.string.soulfood_address, R.drawable.soulfood_mahanakorn));
        items.add(new ListItem(R.string.lordjims, R.string.lordjims_address, R.drawable.lord_jims));
        items.add(new ListItem(R.string.bolan, R.string.bolan_address, R.drawable.bolan));
        items.add(new ListItem(R.string.appia, R.string.appia_address, R.drawable.appia));
        items.add(new ListItem(R.string.danielthaiger, R.string.danielthaiger_address, R.drawable.daniel_thaiger));
        items.add(new ListItem(R.string.chefman, R.string.chefman_address, R.drawable.chef_man));
        items.add(new ListItem(R.string.nahm, R.string.nahm_address, R.drawable.nahm));
        items.add(new ListItem(R.string.gaggan, R.string.gaggan_address, R.drawable.gaggan));
        items.add(new ListItem(R.string.eatme, R.string.eatme_address, R.drawable.eat_me));
        items.add(new ListItem(R.string.somboon, R.string.somboon_address, R.drawable.somboon_seafood));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), items, R.color.category_restaurants);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
