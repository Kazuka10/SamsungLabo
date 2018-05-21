package com.simplifiedcoding.bottomnavigationexample;

import com.samsunglabo.aplikacjaKM.resources.ParseJSON;

import org.junit.Test;

import java.util.Map;
import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by marshall on 14.05.2018.
 */

public class ParseJsonTest
{
    @Test
    public void jsonToArray_isCorrect() throws Exception
    {
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("first", "Edward");
        map.put("last", "Marshall");
        map.put("age", "24");

        String json = "{" +
                "\"first\":\"Edward\"," +
                "\"last\":\"Marshall\"," +
                "\"age\":\"24\"" +
                "}";

        assertEquals(map, ParseJSON.jsonToArray(json));
    }

    @Test
    public void arrayToJson_isCorrect() throws Exception
    {
        String json = "{" +
                "\"last\":\"Marshall\"," +
                "\"first\":\"Edward\"," +
                "\"age\":\"24\"" +
                "}";

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("first", "Edward");
        map.put("last", "Marshall");
        map.put("age", "24");

        assertEquals(json, ParseJSON.arrayToJson(map));
    }
}
