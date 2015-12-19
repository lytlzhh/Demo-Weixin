package com.example.llw.demo_weixin;


import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Chushihua extends Fragment {
    private ImageView imageView;
    private Context context;
    private LayoutInflater layoutInflater;

    public Chushihua(MainActivity mainActivity) {
        // Required empty public constructor
        this.context = mainActivity;
        this.layoutInflater = LayoutInflater.from(context);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = layoutInflater.inflate(R.layout.fragment_chushihua, null);
        imageView = (ImageView) view.findViewById(R.id.imageview_id);
/*
        try {
            Thread.sleep(5000);
            startActivity(new Intent(getActivity(), Weixin.class));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return view;
    }

}
