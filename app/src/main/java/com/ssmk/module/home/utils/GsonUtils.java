package com.ssmk.module.home.utils;

import com.google.gson.Gson;

/**
 * Created by chengqianlang on 2017/7/12.
 */

public class GsonUtils {

            private String json;
            private Class jsonclass;

        public GsonUtils(String json, Class jsonclass) {
            this.json = json;
            this.jsonclass = jsonclass;
        }

        public Object jsonToGson(){
                Gson gson = new Gson();
                return  gson.fromJson(json, jsonclass);
            }


}
