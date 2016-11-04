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

public class SightsFragment extends Fragment {

    public SightsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        final ArrayList<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem(R.string.wat_arun, R.string.wat_arun_address, R.drawable.wat_arun));
        items.add(new ListItem(R.string.lumphini_park, R.string.lumphini_park_address, R.drawable.lumphini_park));
        items.add(new ListItem(R.string.grand_palace, R.string.grand_palace_address, R.drawable.grand_palace));
        items.add(new ListItem(R.string.jim_thompson, R.string.jim_thompson_address, R.drawable.jim_thompson));
        items.add(new ListItem(R.string.khaosan, R.string.khaosan_address, R.drawable.khaosan));
        items.add(new ListItem(R.string.wat_phra_kaew, R.string.wat_phra_kaew_address, R.drawable.wat_phra_kaew));
        items.add(new ListItem(R.string.yaowarat, R.string.yaowarat_address, R.drawable.yaowarat));
        items.add(new ListItem(R.string.wat_pho, R.string.wat_pho_address, R.drawable.wat_pho));
        items.add(new ListItem(R.string.golden_buddha, R.string.golden_buddha_address, R.drawable.golden_buddha));
        items.add(new ListItem(R.string.chatuchak, R.string.chatuchak_address, R.drawable.chatuchak));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), items, R.color.category_all);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
