package com.example.llw.demo_weixin;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Hpone extends Fragment implements AdapterView.OnItemClickListener {
    private ListView listView;
    private List<weixin_class> mylist;
    private LayoutInflater layoutInflater;
    private Context context;

    public Hpone(MainActivity mainActivity) {
        // Required empty public constructor
        this.context = mainActivity;
        this.layoutInflater = LayoutInflater.from(context);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = layoutInflater.inflate(R.layout.fragment_weixin, null);
        listView = (ListView) view.findViewById(R.id.listview_id);
        listView.setOnItemClickListener(this);

        String[] phoneid = new String[]{
                "15025165523",
                "15025163254",
                "15487621554",
                "12356478256",
                "16523589465",
                "14787856892",
                "14787896589",
                "16589324568"
        };

        int[] images = new int[]{
                R.mipmap.aa,
                R.mipmap.bb,
                R.mipmap.cc,
                R.mipmap.dd,
                R.mipmap.ff,
                R.mipmap.gg,
                R.mipmap.hh,
                R.mipmap.jj
        };

        mylist = new ArrayList<>();
        int ss = 0;
        for (int i = 0; i < 40; i++) {
            mylist.add(new weixin_class(images[ss], phoneid[ss]));
            ss++;
            if (ss == phoneid.length) {
                ss = 0;
            }
        }

        listView.setAdapter(new phone_adapter(mylist, context));
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

}
