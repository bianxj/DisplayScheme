package com.bianxj.displayscheme;

import android.app.Application;

/**
 * Created by Administrator on 2017/11/13.
 */

public class DisplayHelper {

    private Builder builder;

    private DisplayHelper(Builder builder){
        this.builder = builder;
    }

    public static class Builder{
        private int xdip;
        private Application application;

        public DisplayHelper build(){
            return new DisplayHelper(this);
        }



    }

}
