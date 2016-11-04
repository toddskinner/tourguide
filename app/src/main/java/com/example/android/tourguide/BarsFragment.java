package com.example.android.tourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class BarsFragment extends Fragment {

    public BarsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        final ArrayList<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem(R.string.vesper, R.string.vesper_address, R.drawable.vesper));
        items.add(new ListItem(R.string.maggiechoos, R.string.maggiecchoos_address, R.drawable.maggie_choos));
        items.add(new ListItem(R.string.ironfairies, R.string.ironfairies_address, R.drawable.iron_fairies));
        items.add(new ListItem(R.string.beam, R.string.beam_address, R.drawable.beam));
        items.add(new ListItem(R.string.singsing, R.string.singsing_address, R.drawable.sing_sing));
        items.add(new ListItem(R.string.above_eleven, R.string.above_eleven_address, R.drawable.above_eleven));
        items.add(new ListItem(R.string.havana_social, R.string.havana_social_address, R.drawable.havana_social));
        items.add(new ListItem(R.string.smalls, R.string.smalls_address, R.drawable.smalls));
        items.add(new ListItem(R.string.hyde_seek, R.string.hyde_seek_address, R.drawable.hyde_seek));
        items.add(new ListItem(R.string.rabbit_hole, R.string.rabbit_hole_address, R.drawable.rabbit_hole));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), items, R.color.category_all);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
