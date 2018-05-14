package com.samsunglabo.aplikacjaKM.resources;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by marshall on 14.05.2018.
 */
public class ParseJSON
{
    public static Map<String, Object> jsonToArray(String json)
    {
        Map<String, Object> map = new HashMap<String, Object>();
        Gson gson = new Gson();

        map = (Map<String, Object>) gson.fromJson(json, map.getClass());

        return map;
    }

    public static String arrayToJson(Map<String, Object> map)
    {
        Gson gson = new Gson();

        return gson.toJson(map);
    }
}
