package com.example.liuying.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liuying on 2017/2/21.
 * 返回信息中Basic内容：
 * "basic":{
 *  "city":"唐山",
 *  "id":"CN101090501",
 *  "update":{
 *      "loc":"2017-02-21 12:51"
 *      }
 * }
 */

public class Basic {
  /*
  *  @SerializedName注解：让JSON字段和Java字段之间建立映射关系
  * */
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updatetime;
    }

}
