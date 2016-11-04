package com.example.android.tourguide;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        final ArrayList<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem(R.string.the_sukhothai, R.string.the_sukhothai_address, R.drawable.sukhothai, R.string.the_sukhothai_desription));
        items.add(new ListItem(R.string.mandarin_oriental, R.string.mandarin_oriental_address, R.drawable.mandarin_oriental_bkk, R.string.mandarin_oriental_desription));
        items.add(new ListItem(R.string.banyan_tree, R.string.banyan_tree_address, R.drawable.banyan_tree, R.string.banyan_tree_desription));
        items.add(new ListItem(R.string.siam_kempinski, R.string.siam_kempinski_address, R.drawable.kempinski, R.string.siam_kempinski_desription));
        items.add(new ListItem(R.string.the_peninsula, R.string.the_peninsula_address, R.drawable.peninsula, R.string.the_peninsula_desription));
        items.add(new ListItem(R.string.the_siam, R.string.the_siam_address, R.drawable.the_siam, R.string.the_siam_desription));
        items.add(new ListItem(R.string.intercontinental, R.string.intercontinental_address, R.drawable.intercontinental, R.string.intercontinental_desription));
        items.add(new ListItem(R.string.st_regis, R.string.st_regis_address, R.drawable.st_regis, R.string.st_regis_desription));
        items.add(new ListItem(R.string.okura_prestige, R.string.okura_prestige_address, R.drawable.okura, R.string.okura_prestige_desription));
        items.add(new ListItem(R.string.anantara_riverside, R.string.anantara_riverside_address, R.drawable.anantara, R.string.anantara_riverside_desription));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), items, R.color.category_all);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
