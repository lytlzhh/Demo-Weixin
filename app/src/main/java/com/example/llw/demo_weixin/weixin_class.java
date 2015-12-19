package com.example.llw.demo_weixin;

import java.io.Serializable;

/**
 * Created by llw on 2015/12/17.
 */
public class weixin_class implements Serializable {
    public String srt = null;
    public int b;

    public weixin_class(int b, String s) {
        this.srt = s;
        this.b = b;
    }

}
