package com.example.llw.demo_weixin;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout linearId;
    private TextView weixinId;
    private Button sercherId;
    private Button addId;
    private FrameLayout framelayoutId;
    private LinearLayout linearBottomId;
    private Button buttonBtWeixin;
    private Button buttonBtPhone;
    private Button buttonBtFind;
    private Button buttonBtMe;

    private Weixin weixin;
    private Hpone hpone;
    private Find find;
    private Me me;
    private SOUs soUs;
    private Chushihua chushihua;

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    private void assignViews() {
        linearId = (LinearLayout) findViewById(R.id.linear_id);
        weixinId = (TextView) findViewById(R.id.weixin_id);
        sercherId = (Button) findViewById(R.id.sercher_id);
        addId = (Button) findViewById(R.id.add_id);
        framelayoutId = (FrameLayout) findViewById(R.id.framelayout_id);
        linearBottomId = (LinearLayout) findViewById(R.id.linear_bottom_id);
        buttonBtWeixin = (Button) findViewById(R.id.button_bt_weixin);
        buttonBtPhone = (Button) findViewById(R.id.button_bt_phone);
        buttonBtFind = (Button) findViewById(R.id.button_bt_find);
        buttonBtMe = (Button) findViewById(R.id.button_bt_me);

        sercherId.setOnClickListener(this);
        addId.setOnClickListener(this);
        buttonBtWeixin.setOnClickListener(this);
        buttonBtFind.setOnClickListener(this);
        buttonBtPhone.setOnClickListener(this);
        buttonBtMe.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
        fragmentManager = getFragmentManager();


     /*   if (chushihua == null) {
            chushihua = new Chushihua(this);
            fragmentTransaction.add(R.id.framelayout_id, chushihua);
        } else {
            fragmentTransaction.show(chushihua);
        }*/
    }


    @Override
    public void onClick(View v) {
        SetAllbutton_color();
        fragmentTransaction = fragmentManager.beginTransaction();
        SetFragment(fragmentTransaction);
        switch (v.getId()) {
            case R.id.sercher_id:
                if (soUs == null) {
                    soUs = new SOUs();
                    fragmentTransaction.add(R.id.framelayout_id, soUs);
                } else {
                    fragmentTransaction.show(soUs);
                }
                break;
            case R.id.add_id:


                break;
            case R.id.button_bt_weixin:

                buttonBtWeixin.setTextColor(Color.BLUE);
                if (weixin == null) {
                    weixin = new Weixin(this);
                    fragmentTransaction.add(R.id.framelayout_id, weixin);
                } else {
                    fragmentTransaction.show(weixin);
                }
                break;
            case R.id.button_bt_phone:

                buttonBtPhone.setTextColor(Color.BLUE);
                if (hpone == null) {
                    hpone = new Hpone(this);
                    fragmentTransaction.add(R.id.framelayout_id, hpone);
                } else {
                    fragmentTransaction.show(hpone);
                }

                break;
            case R.id.button_bt_find:

                buttonBtFind.setTextColor(Color.BLUE);
                if (find == null) {
                    find = new Find();
                    fragmentTransaction.add(R.id.framelayout_id, find);
                } else {
                    fragmentTransaction.show(find);
                }

                break;
            case R.id.button_bt_me:

                buttonBtMe.setTextColor(Color.BLUE);
                if (me == null) {
                    me = new Me();
                    fragmentTransaction.add(R.id.framelayout_id, me);
                } else {
                    fragmentTransaction.show(me);
                }
                break;
        }
        fragmentTransaction.commit();
    }


    public void SetAllbutton_color() {
        buttonBtWeixin.setTextColor(Color.WHITE);
        buttonBtMe.setTextColor(Color.WHITE);
        buttonBtPhone.setTextColor(Color.WHITE);
        buttonBtFind.setTextColor(Color.WHITE);
    }

    public void SetFragment(FragmentTransaction fragmentTransaction) {
        if (weixin != null) {
            fragmentTransaction.hide(weixin);
        }

        if (hpone != null) {
            fragmentTransaction.hide(hpone);
        }

        if (me != null) {
            fragmentTransaction.hide(me);
        }

        if (find != null) {
            fragmentTransaction.hide(find);
        }
    }


}
