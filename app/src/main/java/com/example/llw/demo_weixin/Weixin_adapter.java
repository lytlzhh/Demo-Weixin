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
 * Created by llw on 2015/12/17.
 */
public class Weixin_adapter extends BaseAdapter {
    private ListView listView;
    private List<weixin_class> mylist;
    private Context context;
    private LayoutInflater layoutInflater;

    public Weixin_adapter(List<weixin_class> list, Context weixin) {
        this.mylist = list;
        this.context = weixin;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mylist.size();
    }

    @Override
    public Object getItem(int position) {
        return mylist.get(position);
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
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.imageview_id);
            viewHolder.textView = (TextView) convertView.findViewById(R.id.textview_id);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.imageView.setImageResource(mylist.get(position).b);
        viewHolder.textView.setText(mylist.get(position).srt);
        return convertView;
    }

    public class ViewHolder {
        ImageView imageView;
        TextView textView;
    }

}
