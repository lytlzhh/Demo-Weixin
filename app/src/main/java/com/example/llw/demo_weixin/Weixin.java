package com.example.llw.demo_weixin;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Weixin extends Fragment implements AdapterView.OnItemClickListener {
    private ListView listView;
    private Context context;
    private LayoutInflater layoutInflater;

    List<weixin_class> list = new ArrayList<>();

    public Weixin(MainActivity mainActivity) {
        // Required empty public constructor
        this.context = mainActivity;
        this.layoutInflater = LayoutInflater.from(context);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // ViewHolder viewHolder = new ViewHolder();
       /* if (container == null) {
            container = (ViewGroup) layoutInflater.inflate(R.layout.fragment_weixin, null);
            listView = (ListView) container.findViewById(R.id.listview_id);
        }*/

        View view = layoutInflater.inflate(R.layout.fragment_weixin, null);
        listView = (ListView) view.findViewById(R.id.listview_id);
        listView.setOnItemClickListener(this);

        String[] strings = new String[]{
                "hello", "word", "你好", "世界", "天空", "NBA", "体育", "手机", "hahafhsdkgjdrjfidshvkdflknfkghfdvfnkjfdnvf",
                "发生地方见到了开房间佛为和vifdhgjfi", "反抗精神贷款购房贷款vkfdjjdfkgji 快乐发动进攻的价格"
        };

       /* viewHolder.imageView.setImageResource(R.mipmap.mtrack);
        viewHolder.textView.setText("你好吗？");*/
        int ss = 0;
        for (int i = 0; i < 60; i++) {
            list.add(new weixin_class(R.mipmap.b, strings[ss]));
            ss++;
            if (ss == 10) {
                ss = 0;
            }
        }
        listView.setAdapter(new Weixin_adapter(list, context));

        return view;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                Toast.makeText(context, "0", Toast.LENGTH_SHORT).show();

                break;
            case 1:
                Toast.makeText(context, "1", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(context, "2", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(context, "3", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(context, "4", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(context, "5", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                Toast.makeText(context, "6", Toast.LENGTH_SHORT).show();
                break;
            case 7:
                Toast.makeText(context, "7", Toast.LENGTH_SHORT).show();
                break;
            case 8:
                Toast.makeText(context, "8", Toast.LENGTH_SHORT).show();
                break;
            case 9:
                Toast.makeText(context, "9", Toast.LENGTH_SHORT).show();
                break;
            case 10:
                Toast.makeText(context, "10", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
