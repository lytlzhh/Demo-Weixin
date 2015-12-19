package com.example.llw.demo_weixin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by llw on 2015/12/18.
 */
public class phone_adapter extends BaseAdapter {
    private List<weixin_class> list;
    private Context context;
    private LayoutInflater layoutInflater;
    private ListView listView;

    public phone_adapter(List<weixin_class> mylist, Context hpone) {
        this.context = hpone;
        this.layoutInflater = LayoutInflater.from(context);
        this.list = mylist;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = new ViewHolder();
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.weixin, null);
            // listView = (ListView) convertView.findViewById(R.id.listview_phone_id);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.imageview_id);
            viewHolder.textView = (TextView) convertView.findViewById(R.id.textview_id);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.imageView.setImageResource(list.get(position).b);
        viewHolder.textView.setText(list.get(position).srt);
        return convertView;
    }

    public class ViewHolder {
        ImageView imageView;
        TextView textView;
    }

}
